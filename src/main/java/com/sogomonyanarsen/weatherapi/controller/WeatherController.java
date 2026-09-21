package com.sogomonyanarsen.weatherapi.controller;

import com.sogomonyanarsen.weatherapi.dto.WeatherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/api/weather/{city}")
    public String getWeather(@PathVariable String city) {
        return new WeatherResponse(city, 20.0).toString();
    }
}
