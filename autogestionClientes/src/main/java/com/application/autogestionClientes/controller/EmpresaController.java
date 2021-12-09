package com.application.autogestionClientes.controller;


import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.service.interfaces.IEmpresaService;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import com.application.autogestionClientes.validator.EmpresaValidatorImpl;
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

    @Autowired
    private EmpresaValidatorImpl empresaValidator;

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
    public ResponseEntity<Object> saveEmpresa(@RequestBody EmpresaRequest request) throws ApiUnprocessableEntity {
        this.empresaValidator.validator(request);
        this.empresaService.save(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @DeleteMapping(value = "/{idEmpresa}")
    public ResponseEntity<Object> deleteEmpresa(@PathVariable Long idEmpresa){
        this.empresaService.deleteById(idEmpresa);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping(value="/{idEmpresa}")
    public ResponseEntity<Object> updateEmpresa(@RequestBody EmpresaRequest request, @PathVariable Long idEmpresa){

        return ResponseEntity.ok(Boolean.TRUE);
    }
}
