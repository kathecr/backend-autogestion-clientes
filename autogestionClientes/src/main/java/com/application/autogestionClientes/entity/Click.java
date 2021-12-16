package com.application.autogestionClientes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "click_id")
    private Long idClick;

    @CreatedDate
    @Column(name = "fecha_click")
    private Date fechaClick;

    //------ RELACIONES ------
    @Column(name = "tutorial_id")
    private Long idTutorial;

    @Column(name = "empresa_id")
    private Long idEmpresa;

    //------- MAPEO ------
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
        this.fechaClick = new Date();
    }
}
