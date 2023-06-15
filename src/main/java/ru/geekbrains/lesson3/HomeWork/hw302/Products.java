package ru.geekbrains.lesson3.HomeWork.hw302;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private String sort;
}
