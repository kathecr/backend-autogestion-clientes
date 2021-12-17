package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.dto.CalificacionDto;
import com.application.autogestionClientes.entity.Calificacion;
import com.application.autogestionClientes.entity.Click;
import com.application.autogestionClientes.repository.CalificacionRepository;
import com.application.autogestionClientes.service.interfaces.ICalificacionService;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/calificacion")
public class CalificacionController{

    @Autowired
    ICalificacionService calificacionService;

    @Autowired
    CalificacionRepository calificacionRepository;

    @GetMapping(value = "/tutorial/{id_tutorial}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CalificacionDto>> getByIdTutorial(
            @PathVariable("id_tutorial") Long id,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "1000") Integer size)
    {
        Pageable paging = PageRequest.of(page, size);
        List<CalificacionDto> calificaciones = calificacionService.findByIdTutorial(id,paging);
        return new ResponseEntity<>(calificaciones, new HttpHeaders(), HttpStatus.OK);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveCalificacion(@RequestBody Calificacion request) throws ApiUnprocessableEntity {
        this.calificacionRepository.save(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
