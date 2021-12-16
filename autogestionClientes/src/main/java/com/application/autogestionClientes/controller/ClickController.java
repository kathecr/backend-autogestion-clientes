package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.entity.Click;
import com.application.autogestionClientes.repository.ClickRepository;
import com.application.autogestionClientes.service.interfaces.IClickService;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/click")
public class ClickController {

    @Autowired
    private IClickService clickService;

    @Autowired
    private ClickRepository clickRepository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveClick(@RequestBody Click request) throws ApiUnprocessableEntity {
        this.clickRepository.save(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
