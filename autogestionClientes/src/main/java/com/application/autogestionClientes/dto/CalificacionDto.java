package com.application.autogestionClientes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class CalificacionDto implements Serializable {
    private Long id;
    private Long calificacion;
    private String resena;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaCalificacion;
    private Long idTutorial;
    private Long idEmpresa;
    private String nombreEmpresa;
}
