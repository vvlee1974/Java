package ru.geekbrains.lesson4.HomeWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HW401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину листа: ");
        int n = scanner.nextInt();
        scanner.close();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("Начальный лист0 = " + linkedList);
        System.out.println("Финальный лист1 = " + resList(linkedList));
        System.out.println("Финальный лист2 = " + resultList(linkedList));
        System.out.println("Финальный лист3 = " + reverseList(linkedList));

    }

    /**
     * @apiNote Вариант 1. Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param linkedList входной список чисел
     * @return перевёрнутый список
     */
    private static LinkedList<Integer> resList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer digit : linkedList) {
            result.addFirst(digit);
        }
        return result;
    }

    /**
     * @apiNote Вариант 2. Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param linkedList входной список чисел
     * @return перевёрнутый список
     */
    private static LinkedList<Integer> resultList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> result = new LinkedList<>(linkedList);
        for (int i = 0, j = result.size() - 1; i < result.size() / 2; i++, j--) {
            int tmp = result.get(i);
            result.set(i, result.get(j));
            result.set(j, tmp);
        }
        return result;
    }

    /**
     * @apiNote Вариант 3. Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param linkedList входной список чисел
     * @return перевёрнутый список
     */
    private static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reverse = new LinkedList<>(linkedList);
        Collections.reverse(reverse);
        return reverse;
    }

    /**
     * @param n - входная длина списка
     * @return рандомный список чисел
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(1, 21));
        }
        return linkedList;
    }
}