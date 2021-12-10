package com.application.autogestionClientes.dto;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
@Data
public class TutorialDto implements Serializable {
    private Long idTutorial;
    private String titulo;
    private String descripcion;
    private Double calificacion;
    private Integer numeroCalificaciones;
}
