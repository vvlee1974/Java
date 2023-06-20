package ru.geekbrains.lesson4.HomeWork;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class HW402 {
    public static void main(String[] args) {
        System.out.println("ПРИМЕР 1:");
        System.out.println("Список валидный? : " + isValid(getDeque("(.,)")));
        System.out.println();
        System.out.println("ПРИМЕР 2:");
        System.out.println("Список валидный? : = " + isValid(getDeque("(),,,(]{}")));
        System.out.println();
        System.out.println("ПРИМЕР 3:");
        System.out.println("Список валидный? : = " + isValid(getDeque("(}")));
    }

    /**
     * @apiNote Учитывая строку, s содержащую только символы '(', ')', '{' '}', '[' ']',,,,,,,,,,,,,,,и,,, определите,
     * является ли введенная строка допустимой.
     * @param deq входной список
     * @return Подтверждение или опровержение валидности входного списка
     */
    public static boolean isValid(Deque<String> deq) {
        Deque<String> d = new LinkedList<>();
        boolean flag = false;
        if ((deq.size() % 2) == 0) {
            for (int i = deq.size() - 1; i >= 0; --i) {
                if (deq.isEmpty()) {
                    break;
                }
                for (int j = 0; j < 2; j++) {
                    d.addLast(deq.pollFirst());
                }
                System.out.println("d = " + d);
                flag = (Objects.equals(d.getFirst(), "(") && Objects.equals(d.getLast(), ")")) ||
                        (Objects.equals(d.getFirst(), "[") && Objects.equals(d.getLast(), "]")) ||
                        (Objects.equals(d.getFirst(), "{") && Objects.equals(d.getLast(), "}"));
                d.pollFirst();
                d.pollLast();
                if (!flag) {
                    return false;
                }
                //System.out.println("deq = " + deq);
            }
        }
        return flag;
    }

    /**
     * @param st входная строка
     * @return отсортированный список по заданным символам
     */
    private static Deque<String> getDeque(String st) {
        String[] str = st.split("(?!^)");
        System.out.println("Массив входной строки: " + Arrays.toString(str));
        Deque<String> deq = new LinkedList<>();
        for (String s : str) {
            if (s.equals("(") || s.equals(")")
                    || s.equals("[") || s.equals("]")
                    || s.equals("{") || s.equals("}")) {
                deq.addLast(s);
            }
        }
        System.out.println("Итоговый список = " + deq);
        return deq;
    }
}