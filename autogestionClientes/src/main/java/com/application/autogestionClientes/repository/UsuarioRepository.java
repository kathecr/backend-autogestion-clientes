package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Empresa;
import com.application.autogestionClientes.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Transactional(readOnly = true)
    Optional<Usuario> findByUsuarioNit(String UsuarioNit);
}
