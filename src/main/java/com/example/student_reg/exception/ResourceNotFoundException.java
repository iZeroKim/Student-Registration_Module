package com.example.student_reg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * This class is used in all classes that will throw an exception
 * */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
