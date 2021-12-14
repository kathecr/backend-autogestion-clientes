package com.application.autogestionClientes.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
@Data
public class TutorialDto implements Serializable {

    @JsonAlias("id")
    private Long idTutorial;
    private String titulo;
    private String descripcion;
    private Double calificacion;
    private Integer numeroCalificaciones;
}
