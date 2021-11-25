package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {
}
