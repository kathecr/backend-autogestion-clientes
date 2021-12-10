package com.application.autogestionClientes.security.service;

import com.application.autogestionClientes.entity.Empresa;
import com.application.autogestionClientes.entity.Usuario;
import com.application.autogestionClientes.repository.EmpresaRepository;
import com.application.autogestionClientes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        boolean isNumeric =  username.matches("[+-]?\\d*(\\.\\d+)?");
        if(isNumeric){
            Optional<Empresa> empresaOptional = empresaRepository.findByNit(username);
            if (empresaOptional.isEmpty()) {
                return null;
            }
            Empresa empresa = empresaOptional.get();
            return new User(empresa.getNit(), empresa.getClave(), new ArrayList<>());
        }else {
            Optional<Usuario> usuarioOptional = usuarioRepository.findByNombreUsuario(username);
            if (usuarioOptional.isEmpty()) {
                return null;
            }
            Usuario usuario = usuarioOptional.get();
            return new User(usuario.getNombreUsuario(), usuario.getClave(), new ArrayList<>());
        }
    }
}
