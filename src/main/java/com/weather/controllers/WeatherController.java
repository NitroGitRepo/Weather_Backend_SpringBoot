package com.weather.controllers;

import com.weather.dtos.GetWeatherDto;
import com.weather.services.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    public WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("")
    public String statusCheck(){
        return "Application is Running ✅";
    }

    @GetMapping("/{city}")
    public GetWeatherDto getWeatherByCityName(@PathVariable("city") String city) throws Exception {
        return weatherService.getByName(city);
    }
}
