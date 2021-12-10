package com.application.autogestionClientes.dto;

import com.application.autogestionClientes.enums.Rol;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioRequest implements Serializable {

    @JsonProperty("username")
    private String nombreUsuario;

    @JsonProperty("password")
    private String clave;

    @JsonProperty("role")
    private Rol rol;

}
