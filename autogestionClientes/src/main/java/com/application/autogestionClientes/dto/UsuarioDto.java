package com.application.autogestionClientes.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {

    private Long idUsuario;
    private String usuarioNit;
    private String rol;
}
