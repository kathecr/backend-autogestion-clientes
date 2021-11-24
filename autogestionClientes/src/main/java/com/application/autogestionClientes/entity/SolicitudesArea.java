package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "SolicitudesXArea")
public class SolicitudesArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitudXArea_id")
    private Long idSolicitudArea;

    @Column(name = "numero_solicitudes")
    private Long numeroSolicitudes;

    // Relaciones
    @Column(name = "area_id")
    private Long idArea;

    @Column(name = "reporte_id")
    private Long idReporte;

}
