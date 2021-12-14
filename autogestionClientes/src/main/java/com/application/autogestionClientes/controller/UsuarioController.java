package com.application.autogestionClientes.controller;

import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.dto.UsuarioRequest;
import com.application.autogestionClientes.service.interfaces.IUsuarioService;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> getByNit(@PathVariable("id") Long idUsuario){
        return ResponseEntity.ok(this.usuarioService.findByIdUsuario(idUsuario));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUsuario(@RequestBody UsuarioRequest request) throws ApiUnprocessableEntity {
        //this.empresaValidator.validator(request);
        this.usuarioService.save(request);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

}
