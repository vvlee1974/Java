package ru.geekbrains.lesson3.ClassWork.ex304;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    private Integer size;
    private String color;
    private String material;

    public Integer volumeCube() {
        return size * size * size;
    }
}
