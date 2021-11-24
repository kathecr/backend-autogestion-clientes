package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class Agente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agente_id")
    private Long idAgente;

    private String nombre;

    private String apellido;

    private String correo;

    private String estado;

    private String cedula;

    @Column(name = "area_id")
    private Long idArea;
}
