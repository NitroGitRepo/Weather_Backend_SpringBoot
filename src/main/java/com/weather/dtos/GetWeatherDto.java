package com.weather.dtos;

import com.weather.models.Coordinate;
import com.weather.models.Main;
import com.weather.models.Weather;
import com.weather.models.Wind;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class GetWeatherDto {

    private String cityName;

    private Coordinate coord;

    private Main main;

    private List<Weather> weather;

    private int visibility;

    private String base;

    private Wind wind;
}
