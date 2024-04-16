package com.weather.services;

import com.weather.dtos.GetWeatherDto;
import com.weather.exceptions.CityNotFoundException;
import com.weather.models.WeatherModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

        public GetWeatherDto getByName(String city) throws Exception{
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=1927c7cd7f1540c0cd49625d7701098b";
            WeatherModel weather = null;

            try {
                weather = restTemplate.getForObject(url, WeatherModel.class);
            }catch (RestClientException ex){
               throw new CityNotFoundException(ex.getMessage());
            }

            System.out.println(weather);


//
            GetWeatherDto gt = new GetWeatherDto();
            gt.setCoord(weather.getCoord());
            gt.setCityName(weather.getName());
            gt.setMain(weather.getMain());
            gt.setWeather(weather.getWeather());
            gt.setVisibility(weather.getVisibility());
            gt.setBase(weather.getBase());
            gt.setWind(weather.getWind());

            return gt;
        }
}
