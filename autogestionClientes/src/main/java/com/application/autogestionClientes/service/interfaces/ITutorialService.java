package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.dto.TutorialesDto;
import com.application.autogestionClientes.entity.Tutorial;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface ITutorialService {

    public TutorialesDto findAll(Pageable paging);
    //public List<Tutorial> findAll(Pageable paging);

    public TutorialesDto findByTituloContaing(String titulo, Pageable paging);
    //public List<Tutorial> findByTituloContaing(String titulo, Pageable paging);
}
