package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.dto.UsuarioDto;
import com.application.autogestionClientes.dto.UsuarioRequest;
import com.application.autogestionClientes.entity.Usuario;
import com.application.autogestionClientes.repository.UsuarioRepository;
import com.application.autogestionClientes.service.interfaces.IUsuarioService;
import com.application.autogestionClientes.utils.helper.MHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioImpl implements IUsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    @Override
    public UsuarioDto findByUsuarioNit(String nit) {
        Optional<Usuario> usuario = this.usuarioRepository.findByNombreUsuario(nit);
        if(usuario.isEmpty()){
            return null;
        }
        return convertToUsuarioDto(usuario.get());
    }

    @Override
    public UsuarioDto findByIdUsuario(Long idUsuario) {
        Optional<Usuario> usuario = this.usuarioRepository.findById(idUsuario);
        if(usuario.isEmpty()){
            return null;
        }
        return convertToUsuarioDto(usuario.get());
    }

    @Override
    public void save(UsuarioRequest usuarioRequest) {
        Usuario usuario = MHelpers.modelMapper().map(usuarioRequest, Usuario.class);
        usuario.setClave(bcryptEncoder.encode(usuarioRequest.getClave()));
        this.usuarioRepository.save(usuario);
    }

    @Override
    public void update(UsuarioRequest usuarioRequest, Long idUsuario) {
        Optional<Usuario> UsuarioOpt = this.usuarioRepository.findById(idUsuario);
        Usuario Usuario = UsuarioOpt.get();
    }

    @Override
    public void deleteById(Long idUsuario) {
        this.usuarioRepository.deleteById(idUsuario);
    }

    private UsuarioDto convertToUsuarioDto(final Usuario Usuario){
        return MHelpers.modelMapper().map(Usuario, UsuarioDto.class);
    }
}

