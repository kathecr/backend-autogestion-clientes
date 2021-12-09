package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.dto.TutorialesDto;
import com.application.autogestionClientes.entity.Tutorial;
import com.application.autogestionClientes.service.interfaces.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/tutorial")
public class TutorialController {
    @Autowired
    ITutorialService tutorialService;

    @GetMapping
    public ResponseEntity<TutorialesDto> getAll(
            @RequestParam(required = false) String title,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size)
            //@RequestParam(defaultValue = "id") String sortBy)
    {
        Pageable paging = PageRequest.of(page, size);
        TutorialesDto tutoriales;
        if(title == null){
            tutoriales = tutorialService.findAll(paging);
        }else{
            tutoriales = tutorialService.findByTituloContaing(title,paging);
        }
        return new ResponseEntity<TutorialesDto>(tutoriales, new HttpHeaders(), HttpStatus.OK);
    }
}