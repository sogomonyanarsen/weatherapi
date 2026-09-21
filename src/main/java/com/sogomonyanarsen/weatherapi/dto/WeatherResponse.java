package com.sogomonyanarsen.weatherapi.dto;

public record WeatherResponse(String city, double temp) {
    @Override
    public String toString() {
        return "Weather in: " + city + "is " + temp + " degrees";
    }
}
