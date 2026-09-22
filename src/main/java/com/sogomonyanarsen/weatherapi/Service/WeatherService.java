package com.sogomonyanarsen.weatherapi.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WeatherService {
    private final RestClient restClient;

    @Value("${spring.weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public WeatherService() {
        this.restClient = RestClient.builder().build();
    }

    public String getLiveWeather(String city) {
        String fullUrl = apiUrl + "/" + "?key=" + apiKey;
        return restClient.get()
                .uri(fullUrl)
                .retrieve()
                .body(String.class);
    }
}
