package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_id")
    private Long idSolicitud;

    private String caso;

    private String estado;

    @Column(name = "fecha_solicitud")
    private LocalDateTime fechaGeneracion;

    //------ RELACIONES ------
    // Agente
    @Column(name = "agente_id")
    private Long idAgente;
    // Area
    @Column(name = "area_id")
    private Long idArea;
    // Empresa
    @Column(name = "empresa_id")
    private Long idEmpresa;

    //------ MAPEO ------
    @ManyToOne
    @JoinColumn(name = "agente_id", insertable = false , updatable = false)
    private Agente agente;

    @ManyToOne
    @JoinColumn(name = "area_id", insertable = false , updatable = false)
    private Area area;

    @ManyToOne
    @JoinColumn(name = "empresa_id", insertable = false , updatable = false)
    private Empresa empresa;

}
