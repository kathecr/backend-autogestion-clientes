package com.application.autogestionClientes.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa_id")
    private Long idEmpresa;

    private String nit;

    private String nombre;

    private String celular;

    private String correo;

    private String clave;

    private String licencia;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

  //  @Column(name= "usuario_id")
  //  private Long IdUsuario;
    // ------ MAPEO ------
  //  @OneToOne
  //  @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
  //  private Usuario usuario;

    @OneToMany(mappedBy = "empresa")
    private List<Solicitud> solicitudes;

    @OneToMany(mappedBy = "empresa")
    private List<Calificacion> calificaciones;

    @OneToMany(mappedBy = "empresa")
    private List<Click> Clicks;
}
