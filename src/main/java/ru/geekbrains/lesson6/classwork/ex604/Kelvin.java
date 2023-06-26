package ru.geekbrains.lesson6.classwork.ex604;


public class Kelvin implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}

