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

    // Relaciones
    @Column(name = "agente_id")
    private Long idAgente;

    @Column(name = "area_id")
    private Long idArea;

    @Column(name = "empresa_id")
    private Long idEmpresa;
}
