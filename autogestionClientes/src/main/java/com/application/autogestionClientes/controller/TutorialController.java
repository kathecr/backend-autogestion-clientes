package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.dto.TutorialesDto;
import com.application.autogestionClientes.entity.Tutorial;
import com.application.autogestionClientes.service.interfaces.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/tutorial")
public class TutorialController {
    @Autowired
    ITutorialService tutorialService;

    @GetMapping
    //@ResponseBody
    public ResponseEntity<TutorialesDto> getAll(
            @RequestParam(required = false) String title,
            @RequestParam Integer page,
            @RequestParam Integer size)
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

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tutorial> getById(@PathVariable("id") Long id){
        Tutorial tutorial = tutorialService.findById(id);
        return new ResponseEntity<Tutorial>(tutorial, new HttpHeaders(), HttpStatus.OK);
    }
}
