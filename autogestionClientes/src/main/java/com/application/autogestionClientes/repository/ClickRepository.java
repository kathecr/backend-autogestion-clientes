package com.application.autogestionClientes.repository;

import com.application.autogestionClientes.entity.Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickRepository extends JpaRepository<Click,Long> {

}
