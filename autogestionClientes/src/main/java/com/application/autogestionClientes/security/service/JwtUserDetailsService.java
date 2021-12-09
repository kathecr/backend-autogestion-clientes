package com.application.autogestionClientes.security.service;

import com.application.autogestionClientes.entity.Usuario;
import com.application.autogestionClientes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String Nit) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsuarioNit(Nit).get();
        if(usuario == null){

        }
        return new User(usuario.getUsuarioNit(), usuario.getClave(), new ArrayList<>());
    }
}
