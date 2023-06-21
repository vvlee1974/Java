package ru.geekbrains.lesson5.HomeWork.hw502;

import java.util.Comparator;

public class StafferComparator implements Comparator<Staffers> {
    @Override
    public int compare(Staffers s, Staffers t) {
        int f = s.getName().compareTo(t.getName());
        return (f != 0) ? f : s.getName().compareTo(t.getSurName());
    }
}
