package ru.geekbrains.lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину листа: ");
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
        // Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        for (int i = 0; i < linkedList.size(); i++) { //
            if (linkedList.get(i) < 0) {
                linkedList.remove(i);
                i--;
            }
            // for (int i = linkedList.size()-1; i >=0; i--) {
            //            if(linkedList.get(i)<0){
            //                linkedList.remove(i);
            //            }
            //        }
            //        System.out.println("linkedList = " + linkedList);
        }
        System.out.println("linkedList = " + linkedList);
    }


    /**
     * @param n количество элементов в созданном списке
     * @return новый список
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10) - 5);

        }
        return linkedList;
    }
}
