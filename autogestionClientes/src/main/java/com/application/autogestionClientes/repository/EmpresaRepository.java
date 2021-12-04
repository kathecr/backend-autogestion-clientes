package com.application.autogestionClientes.repository;
import com.application.autogestionClientes.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long> {

    @Transactional(readOnly = true)
    Optional<Empresa> findByNit(String nit);

}
