package com.application.autogestionClientes.dto;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {

    private Long idUsuario;

    private String nombreUsuario;

    private String rol;
}
