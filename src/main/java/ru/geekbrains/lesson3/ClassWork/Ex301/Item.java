package ru.geekbrains.lesson3.ClassWork.Ex301;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    private String name;
    private String country;
    private int volume;

    public Item(String qwe, String asd, Integer i) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }
}
