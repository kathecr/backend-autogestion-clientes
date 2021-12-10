package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.entity.Calificacion;
import com.application.autogestionClientes.service.interfaces.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/calificacion")
public class CalificacionController{

    @Autowired
    ICalificacionService calificacionService;

    @GetMapping(value = "/tutorial/{id_tutorial}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Calificacion>> getByIdTutorial(
            @PathVariable("id_tutorial") Long id,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "3") Integer size)
    {
        Pageable paging = PageRequest.of(page, size);
        List<Calificacion> calificaciones = calificacionService.findByIdTutorial(id,paging);
        return new ResponseEntity<>(calificaciones, new HttpHeaders(), HttpStatus.OK);
    }
}
