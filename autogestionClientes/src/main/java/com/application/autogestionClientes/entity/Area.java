package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id")
    private Long idArea;

    private String nombre;

    //------ MAPEO ------
    @OneToMany(mappedBy = "area")
    private List<Solicitud> solicitudes;

    @OneToMany(mappedBy = "area")
    private List<Agente> agentes;

    @OneToMany(mappedBy = "area")
    private List<SolicitudesArea> SolicitudesAreas;
}
