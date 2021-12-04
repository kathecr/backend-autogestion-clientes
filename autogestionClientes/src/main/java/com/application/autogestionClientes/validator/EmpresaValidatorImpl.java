package com.application.autogestionClientes.validator;

import com.application.autogestionClientes.dto.EmpresaRequest;
import com.application.autogestionClientes.utils.exceptions.ApiUnprocessableEntity;
import org.springframework.stereotype.Component;

@Component
public class EmpresaValidatorImpl implements EmpresaValidator {

    @Override
    public void validator(EmpresaRequest request) throws ApiUnprocessableEntity {
        if(request.getNombre() == null || request.getNombre().isEmpty()){
            message("El nombre es obligatorio");
            System.out.println("El nombre es obligatorio");
        }if(request.getNit() == null || request.getNit().isEmpty()){
            message("El nit es obligatorio");
        }
    }

    private void message(String message) throws ApiUnprocessableEntity{
        throw new ApiUnprocessableEntity(message);
    }
}
