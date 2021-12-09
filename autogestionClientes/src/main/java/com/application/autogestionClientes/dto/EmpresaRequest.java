package com.application.autogestionClientes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class EmpresaRequest implements Serializable {

    @JsonProperty("nit")
    private String nit;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("celular")
    private String celular;
    @JsonProperty("correo")
    private String correo;
}
