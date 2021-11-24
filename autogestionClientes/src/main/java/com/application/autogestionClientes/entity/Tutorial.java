package com.application.autogestionClientes.entity;

import lombok.Data;

import javax.persistence.*;

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
}
