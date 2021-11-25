package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.dto.EmpresaDto;
import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.entity.Empresa;
import com.application.autogestionClientes.repository.EmpresaRepository;
import com.application.autogestionClientes.service.interfaces.IEmpresaService;
import com.application.autogestionClientes.utils.MHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmpresaImpl implements IEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;


    @Override
    public List<EmpresaDto> findAll() {
        List<EmpresaDto> empresasDto = new ArrayList<>();
        Iterable<Empresa> empresas = this.empresaRepository.findAll();
        for(Empresa empresa : empresas) {
            EmpresaDto empresaDto = MHelpers.modelMapper().map(empresa, EmpresaDto.class);
            empresasDto.add(empresaDto);
        }
        return empresasDto;
    }
    @Override
    public EmpresaDto findByNit(String nit) {
        Optional<Empresa> empresa = this.empresaRepository.findByNit(nit);
        if(empresa.isEmpty()){
            return null;
        }
        return convertToEmpresaDto(empresa.get());
    }

    @Override
    public EmpresaDto findByIdEmpresa(Long idEmpresa) {
        Optional<Empresa> empresa = this.empresaRepository.findById(idEmpresa);
        if(empresa.isEmpty()){
            return null;
        }
        return convertToEmpresaDto(empresa.get());
    }

    @Override
    public void save(EmpresaRequest empresaRequest) {
        Empresa empresa = MHelpers.modelMapper().map(empresaRequest, Empresa.class);
        this.empresaRepository.save(empresa);
    }

    @Override
    public void deleteById(Long idEmpresa) {
        this.empresaRepository.deleteById(idEmpresa);
    }

    private EmpresaDto convertToEmpresaDto(final Empresa empresa){
        return MHelpers.modelMapper().map(empresa, EmpresaDto.class);
    }
}
