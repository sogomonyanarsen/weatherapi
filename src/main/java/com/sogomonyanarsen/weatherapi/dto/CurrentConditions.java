package com.sogomonyanarsen.weatherapi.dto;

import java.io.Serializable;

public record CurrentConditions(double temp, double humidity, String conditions) implements Serializable {}
