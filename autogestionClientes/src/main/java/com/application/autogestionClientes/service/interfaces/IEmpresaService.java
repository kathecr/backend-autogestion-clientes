package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.dto.EmpresaDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IEmpresaService {

    List<EmpresaDto> findAll();

    EmpresaDto findByNit(String nit);

    EmpresaDto findByIdEmpresa(Long idEmpresa);

    void save(EmpresaDto empresa);

    void deleteById(Long idEmpresa);





}
