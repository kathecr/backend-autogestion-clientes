package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "MetricasXTutorial")
public class MetricasTutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "metricasXTutorial_id")
    private Long idMetricasTutorial;

    private Double calificacion;

    @Column(name = "numero_clicks")
    private Long numeroClicks;

    // Relaciones
    @Column(name = "tutorial_id")
    private Long idTutorial;

    @Column(name = "reporte_id")
    private Long idReporte;

    //------ MAPEO ------
    @ManyToOne
    @JoinColumn(name = "tutorial_id", insertable = false, updatable = false)
    private  Tutorial tutorial;

    @ManyToOne
    @JoinColumn(name = "reporte_id", insertable = false, updatable = false)
    private  Reporte reporte;
}
