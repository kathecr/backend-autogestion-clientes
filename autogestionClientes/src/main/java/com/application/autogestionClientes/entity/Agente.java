package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

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

    //------ RELACIONES ------
    @Column(name = "area_id")
    private Long idArea;

    //------ MAPEO ------
    @ManyToOne
    @JoinColumn(name = "area_id", insertable = false, updatable = false)
    private  Area area;

    @OneToMany(mappedBy = "agente")
    private List<Solicitud> solicitudes;

}
