package ru.geekbrains.lesson1.ClassWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("zadanie4(a,b) = " + zadanie4(a, b));
        scanner.close();
    }

    /**
     * @apiNote Бинарное сложение. Даны две двоичные строки. Возвращаем их сумму двоичной строки a+b
     * @param a
     * @param b
     * @return
     */
    private static String zadanie4(String a, String b) {
        if (a.length() < b.length()) {
            return zadanie4(b, a);
        }
        int carretka = 0; // todo : переименовать валидно
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carretka++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carretka++;
            }
            result = carretka % 2 + result;
            carretka /= 2;
            j--;
        }
        if(carretka>0){
            result = carretka % 2 + result;
        }
        return result;
    }
}