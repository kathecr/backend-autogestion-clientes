package com.application.autogestionClientes.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "click_id")
    private Long idClick;

    @Column(name = "fecha_click")
    private LocalDateTime fechaClick;

    // Relaciones
    @Column(name = "tutorial_id")
    private Long idTutorial;

    @Column(name = "empresa_id")
    private Long idEmpresa;
}
