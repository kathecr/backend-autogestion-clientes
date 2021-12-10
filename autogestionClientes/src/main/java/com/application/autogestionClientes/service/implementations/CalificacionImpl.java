package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.entity.Calificacion;
import com.application.autogestionClientes.repository.CalificacionRepository;
import com.application.autogestionClientes.service.interfaces.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalificacionImpl implements ICalificacionService {
    @Autowired
    private CalificacionRepository calificacionRepository;
    @Override
    public List<Calificacion> findByIdTutorial(Long idTutorial, Pageable paging) {
        Page<Calificacion> calificaciones = calificacionRepository.findByIdTutorial(idTutorial, paging);
        if(calificaciones.isEmpty()) {
            return new ArrayList<Calificacion>();
        }return calificaciones.getContent();
    }
}
