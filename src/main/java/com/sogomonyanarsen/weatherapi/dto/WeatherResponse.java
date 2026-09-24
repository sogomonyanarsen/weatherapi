package com.sogomonyanarsen.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherResponse(String address, @JsonProperty("resolvedAddress") String fullAddress, CurrentConditions currentConditions) implements Serializable {}
