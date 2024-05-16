package com.example.connectdatabase.exceptions;

import com.example.connectdatabase.utils.Response;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> Exception(Exception e){

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Response.Error(e.getMessage()));
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> RuntimeException(Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.Error(e.getMessage()));
    }
    @ExceptionHandler(BindException.class)
    public ResponseEntity<?> Validate(BindException e){
        Map<String,String> errors=new HashMap<>();
        e.getAllErrors().forEach(objectError -> {
            String field=((FieldError) objectError).getField();
            String mess=objectError.getDefaultMessage();
            errors.put(field,mess);
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Response.Error(errors));
    }

}
