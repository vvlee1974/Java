package ru.geekbrains.lesson3.HomeWork.hw302;

import java.util.Comparator;

public class ProductComparator implements Comparator<Products> {
    @Override
    public int compare(Products s, Products t) {
        int f = s.getName().compareTo(t.getName());
        return (f != 0) ? f : s.getPrice().compareTo(t.getPrice());
    }
}
