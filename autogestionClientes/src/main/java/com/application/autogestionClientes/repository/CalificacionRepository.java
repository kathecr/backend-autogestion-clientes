package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Calificacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {
    @Transactional(readOnly = true)
    Page<Calificacion> findByIdTutorial(Long idTutorial, Pageable paging);

}
