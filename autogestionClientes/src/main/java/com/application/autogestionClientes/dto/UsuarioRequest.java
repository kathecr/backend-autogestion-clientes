package com.application.autogestionClientes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioRequest implements Serializable {
    @JsonProperty("usuario_nit")
    private String usuarioNit;
    @JsonProperty("clave")
    private String clave;
    @JsonProperty("rol")
    private String rol;
}
