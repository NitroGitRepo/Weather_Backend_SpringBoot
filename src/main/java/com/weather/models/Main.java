package com.weather.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Main {
      private double temp;

      private double feels_like;

      private double temp_min;

      private double temp_max;

      private int pressure;

      private int humidity;

      private int sea_level;

      private int grnd_level;
}
