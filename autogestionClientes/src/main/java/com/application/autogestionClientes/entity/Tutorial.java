package com.application.autogestionClientes.entity;

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

    //------ MAPEO ------
    @OneToMany(mappedBy = "tutorial")
    private List<Calificacion> calificaciones;

    @OneToMany(mappedBy = "tutorial")
    private List<Click> Clicks;

    @OneToMany(mappedBy = "tutorial")
    private List<MetricasTutorial> metricasTutoriales;

}
