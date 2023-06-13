package ru.geekbrains.lesson2.HomeWork;

import java.util.Arrays;

import java.util.Random;


public class HW203 {
    public static void main(String[] args) {
        int size = 6;
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(31) - 15;
        }
        System.out.println("Начальный массив: " + Arrays.toString(array));
        //System.out.println(Arrays.toString(array));
        System.out.println("Сумма индесков двухзначных элементов массива = " + getIndexSum(array));
        System.out.println("Итоговый массив = " + Arrays.toString(getFinalArray(array)));
    }

    /**
     * @param array входящий сгенерированный массив
     * @return Итоговый массив
     * @apiNote Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */

    private static int[] getFinalArray(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arr[i] = getIndexSum(array);
            } else arr[i] = array[i];
        }

        return arr;
    }

    /**
     * @param array входящий сгенерированный массив
     * @return Сумма индексов двухзначных элементов массива
     * @apiNote Получить сумму индексов двухзначных элементов массива
     */
    private static int getIndexSum(int[] array) {
        int indexSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) / 10 != 0) indexSum += i;
        }
        return indexSum;
    }
}
