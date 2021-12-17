package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.dto.TutorialesDto;
import com.application.autogestionClientes.entity.Tutorial;
import com.application.autogestionClientes.repository.TutorialRepository;
import com.application.autogestionClientes.service.interfaces.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TutorialImpl implements ITutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public TutorialesDto findAll(Pageable paging) {
        //Pageable paging = PageRequest.of(pageNo, pageSize);
        List<Tutorial> tutoriales;
        Page<Tutorial> pagedResult = tutorialRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            tutoriales = pagedResult.getContent();
        } else {
            tutoriales =  new ArrayList<Tutorial>();
        }
        Integer currentPage = pagedResult.getNumber();
        Long totalItems = pagedResult.getTotalElements();
        Integer totalPages = pagedResult.getTotalPages();
        return new TutorialesDto(tutoriales,currentPage,totalItems,totalPages);
    }

    @Override
    public TutorialesDto findByTituloContaing(String titulo, Pageable paging){
        return null;
    }

    @Override
    public Tutorial findById(Long id){
        Optional<Tutorial> tutorial= tutorialRepository.findById(id);
        if(tutorial.isEmpty()){
            return new Tutorial();
        }
        return tutorial.get();
    }
}
