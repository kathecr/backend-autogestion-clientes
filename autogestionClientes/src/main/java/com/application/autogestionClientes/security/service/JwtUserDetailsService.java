package com.application.autogestionClientes.security.service;

import com.application.autogestionClientes.entity.Empresa;
import com.application.autogestionClientes.repository.EmpresaRepository;
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
    private EmpresaRepository empresaRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String Nit) throws UsernameNotFoundException {
        Empresa empresa = empresaRepository.findByNit(Nit).get();
        if(empresa == null){

        }
        return new User(empresa.getNit(), empresa.getClave(), new ArrayList<>());
    }
}
