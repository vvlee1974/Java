package ru.geekbrains.lesson3.ClassWork.Ex302;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private  String name;
    private  int groupNumber;
    private  int salary;
    private List<Integer> scores;
}

