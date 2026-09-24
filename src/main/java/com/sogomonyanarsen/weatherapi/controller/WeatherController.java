package com.sogomonyanarsen.weatherapi.controller;

import com.sogomonyanarsen.weatherapi.service.WeatherService;
import com.sogomonyanarsen.weatherapi.dto.WeatherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/weather/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getLiveWeather(city);
    }
}
