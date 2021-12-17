package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.dto.CalificacionDto;
import com.application.autogestionClientes.entity.Calificacion;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICalificacionService {
    public List<CalificacionDto> findByIdTutorial(Long idTutorial, Pageable paging);
}
