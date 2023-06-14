package ru.geekbrains.lesson3.HomeWork.hw301;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private Integer price;
    private String grade;
}
