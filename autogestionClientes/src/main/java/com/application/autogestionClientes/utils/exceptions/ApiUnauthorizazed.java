package com.application.autogestionClientes.utils.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception personalizada de status 401
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnauthorizazed extends Exception{
    public ApiUnauthorizazed(String message){
        super(message);
    }
}
