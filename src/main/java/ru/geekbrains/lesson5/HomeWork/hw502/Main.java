package ru.geekbrains.lesson5.HomeWork.hw502;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Staffers staffer1 = new Staffers("Иван", "Иванов", "Иван Иванов");
        Staffers staffer2 = new Staffers("Светлана", "Петрова", "Светлана Петрова");
        Staffers staffer3 = new Staffers("Кристина", "Белова", "Кристина Белова");
        Staffers staffer4 = new Staffers("Анна", "Мусина", "Анна Мусина");
        Staffers staffer5 = new Staffers("Анна", "Крутова", "Анна Крутова");
        Staffers staffer6 = new Staffers("Иван", "Юрин", "Иван Юрин");
        Staffers staffer7 = new Staffers("Петр", "Лыков", "Петр Лыков");
        Staffers staffer8 = new Staffers("Павел", "Чернов", "Павел  Чернов");
        Staffers staffer9 = new Staffers("Петр", "Чернышов", "Петр Чернышов");
        Staffers staffer10 = new Staffers("Мария", "Федорова", "Мария Федорова");
        Staffers staffer11 = new Staffers("Марина", "Светлова", "Марина Светлова");
        Staffers staffer12 = new Staffers("Мария", "Савина", "Мария Савина");
        Staffers staffer13 = new Staffers("Мария", "Рыкова", "Мария Рыкова");
        Staffers staffer14 = new Staffers("Марина", "Лугова", "Марина Лугова");
        Staffers staffer15 = new Staffers("Анна", "Владимирова", "Анна Владимирова");
        Staffers staffer16 = new Staffers("Иван", "Мечников", "Иван Мечников");
        Staffers staffer17 = new Staffers("Петр", "Петин", "Петр Петин");
        Staffers staffer18 = new Staffers("Иван", "Ежов", "Иван Ежов");
        ArrayList<Staffers> list = new ArrayList<>();
        list.add(staffer1);
        list.add(staffer2);
        list.add(staffer3);
        list.add(staffer4);
        list.add(staffer5);
        list.add(staffer6);
        list.add(staffer7);
        list.add(staffer8);
        list.add(staffer9);
        list.add(staffer10);
        list.add(staffer11);
        list.add(staffer12);
        list.add(staffer13);
        list.add(staffer14);
        list.add(staffer15);
        list.add(staffer16);
        list.add(staffer17);
        list.add(staffer18);
        System.out.print("Исходный массив данных сотрудников:  \n" + list);
        System.out.println();
        System.out.println();

        findStaffers(list);
    }

    /**
     * @apiNote Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
     * Отсортировать по убыванию популярности.
     * @param list исходный массив данных сотрудников
     */
    private static void findStaffers(ArrayList<Staffers> list) {
        Map<String, Integer> map = new HashMap<>();
        list.sort(new StafferComparator());
        for (Staffers staffer : list) {
            if (staffer != null) {
                map.putIfAbsent((staffer.getName()), 0);
                map.put(staffer.getName(), map.get(staffer.getName()) + 1);
            }
        }
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        sortedMap.entrySet().forEach(System.out::println);
    }
}
