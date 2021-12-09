package com.application.autogestionClientes.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmpresaDto implements Serializable {

    private Long idEmpresa;
    private String nombre;
    private String celular;
    private String correo;
    private String licencia;
    private String fechaVencimiento;

}
