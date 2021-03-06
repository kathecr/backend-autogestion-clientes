package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository <Tutorial,Long> {
    Page<Tutorial> findByTituloContaining(String title, Pageable pageable);
}
