package com.sogomonyanarsen.weatherapi.service;

import com.sogomonyanarsen.weatherapi.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WeatherService {
    private final RestClient restClient;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public WeatherService() {
        this.restClient = RestClient.builder().build();
    }

    @Cacheable(value = "weatherDtoCache", key = "#city")
    public WeatherResponse getLiveWeather(String city) {
        String fullUrl = apiUrl + "/" + city + "?key=" + apiKey;
        return restClient.get()
                .uri(fullUrl)
                .retrieve()
                .body(WeatherResponse.class);
    }
}
