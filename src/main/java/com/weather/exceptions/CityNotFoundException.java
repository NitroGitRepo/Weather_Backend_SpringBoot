package com.weather.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CityNotFoundException extends Exception{

    public CityNotFoundException(){
        super("No City Found With Given Name");
    }
}
