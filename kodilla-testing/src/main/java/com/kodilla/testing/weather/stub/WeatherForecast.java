package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double average(){
        double temp=0;
        int counter=0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            counter++;
            temp+=temperature.getValue();
        }
        double aver = temp / counter;
        return aver;
    }

    public double mediana(){
        List<Double> series = new ArrayList<>();
        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            for (int i=0; i < 5; i++) {
                series.add(entry.getValue());
            }
        }
        double median = 0;
        if (series.size() % 2 == 0) {
            int sum = 0;
            for (double element : series) {
                sum += element;
            }
            median = sum / 2;
        } else {
            Collections.sort(series);
            median = (series.get((series.size() - 1) / 2) + series.get(series.size() / 2)) / 2;
        }
        return median;
    }
}
