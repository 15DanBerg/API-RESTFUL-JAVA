package com.apirestfull.berg.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.apirestfull.berg.model.err.ErrorMensage;
import com.apirestfull.berg.model.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandle {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResorceNotFoundExcepition(ResourceNotFoundException ex){

        ErrorMensage error = new ErrorMensage("Not Found", HttpStatus.NOT_FOUND.value() , ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    } 
    
}
