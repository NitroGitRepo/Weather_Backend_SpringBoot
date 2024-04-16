package com.weather.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Wind {
    private double speed;
    private double deg;
    private double gust;
}
