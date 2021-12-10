package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.entity.Calificacion;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICalificacionService {
    public List<Calificacion> findByIdTutorial(Long idTutorial, Pageable paging);
}
