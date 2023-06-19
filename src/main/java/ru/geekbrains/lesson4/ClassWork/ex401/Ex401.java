package ru.geekbrains.lesson4.ClassWork.ex401;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex401 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println("linkedList = " + linkedList);
        scanner.close();
        System.out.println("linkedList.peek() = " + linkedList.peek());
        System.out.println("linkedList .peek()= " + linkedList);
        System.out.println("linkedList.pop() = " + linkedList.pop());
        System.out.println("linkedList .pop() = " + linkedList);
        linkedList.push(1);
        System.out.println("linkedList .push(1) = " + linkedList);
        linkedList.add(2); // добавляет в конец
        linkedList.addLast(3); // добавляет в конец
        linkedList.addFirst(3); // добавляет в начало
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.contains(3) = " + linkedList.contains(3));
    }
}
