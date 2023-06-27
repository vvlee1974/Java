package ru.geekbrains.lesson6.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Lenovo", "ThinkPad X1 Carbon", 15,
                8, 256, "Win10", "Black", 90000));
        notebooks.add(new Notebook("Asus", "ZenBook Flip S", 15,
                16, 512, "Win10", "Gold", 100000));
        notebooks.add(new Notebook("Apple", "MacBook Pro 15", 14,
                16, 256, "macOS", "Gray", 150000));
        notebooks.add(new Notebook("Lenovo", "ThinkPad X3 Carbon", 17,
                32, 512, "Win10", "White", 70000));
        notebooks.add(new Notebook("Acer", "Aspire 1 A 115-32-P859", 15,
                8, 128, "Win11", "White", 28000));
        notebooks.add(new Notebook("Acer", "Aspire 3 A 314-35-P7C5", 14,
                8, 256, "Win11", "White", 31000));
        notebooks.add(new Notebook("Acer", "Nitro 5 AN 515-46-R7XU", 14,
                16, 512, "Win11", "White", 70000));
        notebooks.add(new Notebook("MSI", "Modern 15 B12M-215XRU", 15,
                8, 256, "Win11", "White", 40000));
        notebooks.add(new Notebook("MSI", "Katana 11SC-483XRU", 15,
                8, 256, "Win11", "Black", 70000));

        System.out.println("0 - Нет");
        System.out.println("1 - Да");
        System.out.println("Хотите выбрать  фильтр? Нет / Да:");
        Scanner scanner = new Scanner(System.in);
        int request = scanner.nextInt();
        int filterNumber = getFilterNumber(scanner, request, notebooks);
        List<Notebook> filteredNotebooks = getSortNotebooks(notebooks, scanner, filterNumber);
        System.out.println("===================================================================");
        System.out.println("0 - Нет");
        System.out.println("1 - Да");
        System.out.println("Хотите выбрать другой фильтр? Нет / Да:");
        int choice = scanner.nextInt();
        while (choice != 0) {
            getSortNotebooks(filteredNotebooks, scanner, getFilterNumber(scanner, choice, filteredNotebooks));
            System.out.println("0 - Нет");
            System.out.println("1 - Да");
            System.out.println("Хотите выбрать другой фильтр? Нет / Да:");
            choice = scanner.nextInt();
        }
        scanner.close();
    }

    /**
     * @param scanner   ввод номера фильтра
     * @param request   запрос применения фильтров
     * @param notebooks Полный список ноутбуков
     * @return номер фильтра
     */
    private static int getFilterNumber(Scanner scanner, int request, List<Notebook> notebooks) {
        if (request == 0) {
            for (Notebook notebook : notebooks) {
                System.out.println(" - " + notebook.getManufacturer() + " " + notebook.getModel() + " / " +
                        notebook.getDisplaySize() + " / " + notebook.getRamSize() + " / " +
                        notebook.getHddSize() + " / " + notebook.getOs() + " / " +
                        notebook.getColor() + " / " + notebook.getPrice());
            }
            System.exit(-1);
        } else {
            System.out.println("1 - Производитель");
            System.out.println("2 - Модель");
            System.out.println("3 - Размер дисплея");
            System.out.println("4 - Объём ОЗУ");
            System.out.println("5 - Объём жёсткого диска");
            System.out.println("6 - Операционная система");
            System.out.println("7 - Цвет");
            System.out.println("8 - Цена");
            System.out.println("Выберете необходимый фильтр:");
        }
        return scanner.nextInt();
    }

    /**
     * @param notebooks    входящий список ноутбуков
     * @param scanner      ввод необходимого номера фильтра
     * @param filterNumber номер фильтра
     * @return Отфильтрованный список ноутбуков
     */
    private static List<Notebook> getSortNotebooks(List<Notebook> notebooks, Scanner scanner, int filterNumber) {
        Map<String, Object> filters = getFilterMap(scanner, filterNumber);
        List<Notebook> filteredNotebooks = NotebookFilter.filter(notebooks, filters);
        if (filteredNotebooks.size() == 0) {
            System.out.println("Нет товаров, удовлетворяющих заданным условиям фильтра");
        } else {
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(" - " + notebook.getManufacturer() + " " + notebook.getModel() + " / " +
                        notebook.getDisplaySize() + " / " + notebook.getRamSize() + " / " +
                        notebook.getHddSize() + " / " + notebook.getOs() + " / " +
                        notebook.getColor() + " / " + notebook.getPrice());
            }
            System.out.println("===================================================================");
        }
        return filteredNotebooks;
    }

    /**
     * @param scanner      ввод для выбора фильтра
     * @param filterNumber выбор критерия фильтрации
     * @return критерии фильтрации
     */
    private static Map<String, Object> getFilterMap(Scanner scanner, Integer filterNumber) {
        String filterKey;
        Map<String, Object> filters = new HashMap<>();
        if (filterNumber <= 8 && filterNumber >= 0) {
            switch (filterNumber) {
                case 1 -> {
                    filterKey = "manufacturer";
                    System.out.println("Введите производителя: ");
                    String manufacturer = scanner.next();
                    filters.put(filterKey, manufacturer);
                }
                case 2 -> {
                    filterKey = "model";
                    System.out.println("Введите модель: ");
                    String model = scanner.next();
                    filters.put(filterKey, model);
                }
                case 3 -> {
                    filterKey = "displaySize";
                    System.out.println("Введите диагональ дисплея: ");
                    Integer displaySize = scanner.nextInt();
                    filters.put(filterKey, displaySize);
                }
                case 4 -> {
                    filterKey = "ramSize";
                    System.out.println("Введите объём ОЗУ: ");
                    Integer ramSize = scanner.nextInt();
                    filters.put(filterKey, ramSize);
                }
                case 5 -> {
                    filterKey = "hddSize";
                    System.out.println("Введите объём жёсткого диска: ");
                    Integer hddSize = scanner.nextInt();
                    filters.put(filterKey, hddSize);
                }
                case 6 -> {
                    filterKey = "os";
                    System.out.println("Введите операционную систему: ");
                    String os = scanner.next();
                    filters.put(filterKey, os);
                }
                case 7 -> {
                    filterKey = "color";
                    System.out.println("Введите цвет: ");
                    String color = scanner.next();
                    filters.put(filterKey, color);
                }
                case 8 -> {
                    filterKey = "price";
                    System.out.println("Введите минимальную цену: ");
                    Integer price = scanner.nextInt();
                    filters.put(filterKey, price);
                }
            }
        } else {
            System.out.println("Некорректные данные. Повторите ввод.");
            System.exit(-1);
        }
        return filters;
    }
}
