package com.application.autogestionClientes.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    private String clave;

    private String rol;

   // @OneToOne(mappedBy = "usuario")
   // private Empresa empresa;

}
