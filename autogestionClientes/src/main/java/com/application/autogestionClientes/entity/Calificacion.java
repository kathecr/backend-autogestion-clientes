package com.application.autogestionClientes.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calificacion_id")
    private Long idCalificacion;

    private Long calificacion;

    private String resena;

    @Column(name = "fecha_calificacion")
    private LocalDateTime fechaCalificacion;

    //------ Relaciones ------
    @Column(name = "tutorial_id")
    private Long idTutorial;

    @Column(name = "empresa_id")
    private Long idEmpresa;

    //------- Mapeo ------
    @ManyToOne
    @JoinColumn(name = "tutorial_id", insertable = false, updatable = false)
    private Tutorial tutorial;

    @ManyToOne
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

}
