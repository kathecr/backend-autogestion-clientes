package com.application.autogestionClientes.validator;

import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.stereotype.Service;

/**
 * Interface de la validacion de datos recibidos para la creación de empresas
 */
@Service
public interface EmpresaValidator {
    void validator(EmpresaRequest request) throws ApiUnprocessableEntity;
}
