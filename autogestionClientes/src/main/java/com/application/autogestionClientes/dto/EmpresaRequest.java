package com.application.autogestionClientes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class EmpresaRequest implements Serializable {

    @JsonProperty("nit")
    private String nit;
    @JsonProperty("name")
    private String nombre;
    @JsonProperty("phone")
    private String celular;
    @JsonProperty("email")
    private String correo;
    @JsonProperty("password")
    private String clave;
    @JsonProperty("license")
    private String licencia;

    @JsonProperty("expiration_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaVencimiento;
}
