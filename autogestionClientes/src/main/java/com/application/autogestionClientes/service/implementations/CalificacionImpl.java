package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.dto.CalificacionDto;
import com.application.autogestionClientes.entity.Calificacion;
import com.application.autogestionClientes.repository.CalificacionRepository;
import com.application.autogestionClientes.service.interfaces.ICalificacionService;
import com.application.autogestionClientes.utils.helper.MHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalificacionImpl implements ICalificacionService {
    @Autowired
    private CalificacionRepository calificacionRepository;
    @Override
    public List<CalificacionDto> findByIdTutorial(Long idTutorial, Pageable paging) {
        List<CalificacionDto> calificacionesDto = new ArrayList<>();
        Iterable<Calificacion> calificaciones = calificacionRepository.findByIdTutorial(idTutorial, paging);
        for(Calificacion calificacion: calificaciones) {
            CalificacionDto calificacionDto = MHelpers.modelMapper().map(calificacion, CalificacionDto.class);
            calificacionesDto.add(calificacionDto);
        }
        return calificacionesDto;
    }
}
