package com.application.autogestionClientes.service.interfaces;

import com.application.autogestionClientes.dto.UsuarioDto;
import com.application.autogestionClientes.dto.UsuarioRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUsuarioService {

    UsuarioDto findByUsuarioNit(String nit);

    UsuarioDto findByIdUsuario(Long idUsuario);

    void save(UsuarioRequest usuario);

    void update(UsuarioRequest usuario, Long idUsuario);

    void deleteById(Long idUsuario);

}
