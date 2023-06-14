package ru.geekbrains.lesson3.ClassWork.ex304;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(2, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "красный", "металлический");
        Cube cube5 = new Cube(2, "желтый", "деревянный");
        Cube cube6 = new Cube(2, "желтый", "деревянный");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube5);
        cubeList.add(cube6);
        System.out.println("cubeList = " + cubeList);
        System.out.println("unicumListCube(cubeList) = " + unicumListCube(cubeList));
    }

    /**
     * @param cubeList входной список кубов
     * @return уникальная колекция
     */
    private static Collection<Cube> unicumListCube(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
