package com.application.autogestionClientes.controller;


import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.service.interfaces.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;

@CrossOrigin("*")
@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok(this.empresaService.findAll());
    }

    @GetMapping(value = "/nit/{nit}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> getByNit(@PathVariable("nit") String nit){
        return ResponseEntity.ok(this.empresaService.findByNit(nit));
    }

    @PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveEmpresa(@RequestBody EmpresaRequest request){
        this.empresaService.save(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
