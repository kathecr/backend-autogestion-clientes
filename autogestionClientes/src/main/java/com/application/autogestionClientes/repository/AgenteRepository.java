package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenteRepository extends JpaRepository <Agente,Long> {
}
