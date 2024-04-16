package com.weather.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CityNotFoundException extends Exception{

    public CityNotFoundException(String message){
        super("No City Found With Given Name: "+ message);
    }
}
