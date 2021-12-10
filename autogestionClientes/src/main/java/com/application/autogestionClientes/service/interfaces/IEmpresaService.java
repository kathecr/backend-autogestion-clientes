package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.dto.EmpresaDto;
import com.application.autogestionClientes.dto.EmpresaRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmpresaService {

    List<EmpresaDto> findAll();

    EmpresaDto findByNit(String nit);

    EmpresaDto findByIdEmpresa(Long idEmpresa);

    void save(EmpresaRequest empresa);

    void update(EmpresaRequest empresa, Long idEmpresa);

    void deleteById(Long idEmpresa);





}
