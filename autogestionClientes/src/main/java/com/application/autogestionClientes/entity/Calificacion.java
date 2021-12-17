package com.application.autogestionClientes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calificacion_id")
    private Long id;

    private Long calificacion;

    private String resena;

    @CreatedDate
    @Column(name = "fecha_calificacion")
    private Date fechaCalificacion;

    //------ Relaciones ------
    @Column(name = "tutorial_id")
    private Long idTutorial;

    @Column(name = "empresa_id")
    private Long idEmpresa;

    //------- Mapeo ------
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tutorial_id", insertable = false, updatable = false)
    private Tutorial tutorial;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

    @PrePersist
    protected void prePersist() {
        this.fechaCalificacion = new Date();
    }
}
