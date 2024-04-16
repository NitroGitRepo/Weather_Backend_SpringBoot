package com.weather.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class WeatherModel {
        private Coordinate coord;
        private List<Weather> weather;
        private Main main;
        private long id;
        private String name;
        private int cod;
        private int visibility;
        private String base;
        private Wind wind;
}
