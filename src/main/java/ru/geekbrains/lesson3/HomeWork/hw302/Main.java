package ru.geekbrains.lesson3.HomeWork.hw302;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products product1 = new Products("Printer", "China", 3.2, 6500, "3");
        Products product2 = new Products("Printer", "China", 3.6, 3500, "3");
        Products product3 = new Products("Printer", "China", 3.9, 9500, "2");
        Products product4 = new Products("Monitor", "China", 3.7, 17500, "1");
        Products product5 = new Products("Monitor", "China", 3.7, 7500, "3");
        Products product6 = new Products("Monitor", "China", 0.6, 1500, "3");
        Products product7 = new Products("Keyboard", "China", 1.1, 2500, "3");
        Products product8 = new Products("Keyboard", "China", 1.7, 6500, "2");
        Products product9 = new Products("Keyboard", "China", 1.7, 1500, "3");
        Products product10 = new Products("Mouse", "China", 1.7, 9500, "1");
        Products product11 = new Products("Mouse", "China", 1.7, 4500, "3");
        Products product12 = new Products("Mouse", "China", 1.7, 500, "3");
        ArrayList<Products> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        list.add(product9);
        list.add(product10);
        list.add(product11);
        list.add(product12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String grade = scanner.nextLine();
        System.out.println("listSort(list, grade) = " + listSort(list, grade));
        nameMinPrice(listSort(list, grade), grade);
        scanner.close();
    }

    /**
     * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * @param listSort входящий отсортированный массив
     * @param grade заданный сорт
     */
    private static void nameMinPrice(ArrayList<Products> listSort, String grade) {
        int i = 0;
        int p = listSort.get(i).getPrice();
        String n = listSort.get(i).getName();
        StringBuilder result = new StringBuilder();
        for (Products product : listSort) {
            if (product.getPrice() <= p) {
                if (product.getName().contains(n)) {
                    p = product.getPrice();
                    result.append(product.getName()).append(" - ").append(product.getPrice()).append("\n");
                }else {
                    result.append(product.getName()).append(" - ").append(product.getPrice()).append("\n");
                    p = product.getPrice();
                    n = product.getName();
                }
            } else if (!product.getName().contains(n)) {
                p = product.getPrice();
                n = product.getName();
                result.append(product.getName()).append(" - ").append(product.getPrice()).append("\n");
            }
            i++;
        }
        System.out.println("Самые бюджетные товары " + grade + " сорта: \n" + result);
    }

    /**
     * @param list входящий массив
     * @param grade  заданный сорт
     * @return отсортированный массив (по  сорту)
     */
    private static ArrayList<Products> listSort(ArrayList<Products> list, String grade) {
        ArrayList<Products> result = new ArrayList<>();
        list.sort(new ProductComparator());
        for (Products product : list) {
            if (product.getSort().equals(grade)) {
                result.add(product);
            }
        }
        return result;
    }
        }
