package ru.geekbrains.lesson3.ClassWork.ex303;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(2, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "красный", "металлический");
        Cube cube3 = new Cube(4, "зеленый", "металлический");
        Cube cube4 = new Cube(2, "желтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        int k = 0;
        int volume = 0;
        int kWood = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")) {
                k++;
                volume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("volume = " + volume);
        System.out.println("kWood = " + kWood);
    }
}
