package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reporte_id")
    private Long idReporte;

    private String nombre;

    @Column(name = "tipo_generacion")
    private String tipoGeneracion;

    @Column(name = "tipo_rango")
    private String tipoRango;

    @Column(name = "fecha_reporte")
    private LocalDateTime fechaReporte;

    @Column(name = "fecha_generacion")
    private LocalDateTime fechaGeneracion;

    //------ MAPEO ------
    @OneToMany(mappedBy = "reporte")
    private List<SolicitudesArea> SolicitudesAreas;

    @OneToMany(mappedBy = "reporte")
    private List<MetricasTutorial> metricasTutoriales;
}
