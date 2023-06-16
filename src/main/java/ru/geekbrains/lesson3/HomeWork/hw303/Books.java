package ru.geekbrains.lesson3.HomeWork.hw303;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private  String title;
    private  String author;
    private  Integer price;
    private  Integer published;
    private  Integer pages;
}
