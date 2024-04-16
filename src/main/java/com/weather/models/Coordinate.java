package com.weather.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Coordinate {
    private double lon;

    private double lat;
}
