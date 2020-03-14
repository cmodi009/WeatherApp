package com.chintan.youtubeweatherapp;

public class CurrentWeather {
    final String location;
    final int conditionId;
    final String weatherCondition;
    final double tempKelvin;

    public CurrentWeather(final String location,
                          final int conditionId,
                          final String weatherCondition,
                          final double tempKelvin) {
        this.location = location;
        this.conditionId = conditionId;
        this.weatherCondition = weatherCondition;
        this.tempKelvin = tempKelvin;
    }

    public int getTempCelsius() {
        return (int) (tempKelvin -273.15);
    }
}
