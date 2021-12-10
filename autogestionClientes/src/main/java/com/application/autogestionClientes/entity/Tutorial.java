package com.application.autogestionClientes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutorial_id")
    private Long idTutorial;

    private String titulo;

    private String descripcion;

    private Double calificacion;

    @Column(name = "numero_calificaciones")
    private Integer numeroCalificaciones;

    //------ MAPEO ------
    @JsonIgnore
    @OneToMany(mappedBy = "tutorial")
    private List<Calificacion> calificaciones;

    @JsonIgnore
    @OneToMany(mappedBy = "tutorial")
    private List<Click> Clicks;

    @JsonIgnore
    @OneToMany(mappedBy = "tutorial")
    private List<MetricasTutorial> metricasTutoriales;

}
