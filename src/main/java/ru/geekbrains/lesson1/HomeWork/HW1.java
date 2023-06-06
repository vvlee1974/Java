package ru.geekbrains.lesson1.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Введите  строку слов через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println();
        System.out.println("Итоговая строка:");
        System.out.println(getNewString(str));
    }

    /**
     * @param str
     * @return String res
     * @apiNote Дана строка слов или ввести строку. Вывести строку слов в обратном порядке, объединённую одним пробелом.
     */
    private static String getNewString(String str) {
        String s = str.toLowerCase().trim().replaceAll("\\s+", " ");

        String[] st = s.split(" ");

        String[] result = new String[st.length];
        int j = 0;
        for (int i = st.length - 1; i >= 0; i--) {
            result[j] = st[i];
            j++;
        }
        String res = String.join(" ", result);

        return res;
    }
}
