package com.application.autogestionClientes.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception personalizada de status 404
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFound extends Exception{

    public ApiNotFound(String message){
        super(message);
    }
}
