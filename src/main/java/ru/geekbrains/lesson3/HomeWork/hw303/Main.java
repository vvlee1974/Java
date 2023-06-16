package ru.geekbrains.lesson3.HomeWork.hw303;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Война и мир", "Толстой", 2040, 2021, 811);
        Books book2 = new Books("Бег времени", "Ахматова", 160, 2014, 349);
        Books book3 = new Books("Гранатовый браслет", "Куприн", 178, 2021, 433);
        Books book4 = new Books("Аленький  цветочек", "Аксаков", 178, 2021, 431);
        ArrayList<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        System.out.println(booksList);
        StringBuilder sortedBooks = new StringBuilder();
        for (Books item : booksList) {
            if (isPrime(item.getPages()) && item.getAuthor().toLowerCase().contains("а")) {
                if (item.getPublished() >= 2010 && item.getPublished() <= 2023) {
                    sortedBooks.append(item.getTitle()).append("\n");
                }
            }
        }
        System.out.println();
        System.out.println(sortedBooks);
    }

    /**
     * @apiNote Проверка на принадлежность числа страниц к простым числам
     * @param a введённое число
     * @return true, если число простое
     */
    private static boolean isPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return a != 1 && count <= 2;
    }
}
