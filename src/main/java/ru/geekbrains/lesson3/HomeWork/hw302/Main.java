package ru.geekbrains.lesson3.HomeWork.hw302;

import java.util.ArrayList;

import java.util.Scanner;

import static java.util.Comparator.naturalOrder;

public class Main {
    public static void main(String[] args) {
        // Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
        // Получить наименования товаров заданного сорта с наименьшей ценой.
        Products product1 = new Products("Monitor", "China", 3.2, 16500, "2");
        Products product2 = new Products("Keyboard", "China", 3.6, 50, "2");
        Products product3 = new Products("Monitor", "China", 3.9, 500, "2");
        Products product4 = new Products("Monitor", "China", 3.7, 19500, "2");

        Products product5 = new Products("Keyboard", "China", 1.9, 8500, "2");
        Products product6 = new Products("Keyboard", "China", 0.6, 1200, "2");
        Products product7 = new Products("Keyboard", "China", 1.1, 20, "2");
        Products product8 = new Products("Monitor", "China", 1.7, 200, "2");

        ArrayList<Products> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сорт товара: ");
        String grade = scanner.nextLine();
        System.out.println("listSort(list, grade) = " + listSort(list, grade));
        //System.out.println("nameMinPrice(listSort(list, grade)) = " + nameMinPrice(listSort(list, grade)));
        scanner.close();
        nameMinPrice(listSort(list, grade));
    }

    private static void nameMinPrice(ArrayList<Products> listSort) {
        //int min;
        int i = 0;
        int p = listSort.get(i).getPrice(); //  цена первого элемента входящего листа product.getPrice() < p
        String n = listSort.get(i).getName(); // имя первого элемента входящего листа product.getName().equals(n)

        for (Products item : listSort) {
            if (item.getPrice()  < p &&  item.getName().contains(n)){
                
            }
        }



       /* for (Products product : listSort) {

            if (product.getName().equals(n)) {
                for (Products products : listSort) {

                }
                n = product.getName();
                if (product.getPrice() < p) {
                    p = product.getPrice();


                    //System.out.println(p);
                    //System.out.println(n);


                }
            } else {
                p = product.getPrice();
                n = product.getName();
                System.out.println(n);
                System.out.println(p);
            }
            i++;
        }
        //System.out.println(n);
        //System.out.println(p);*/
    }

    private static ArrayList<Products> listSort(ArrayList<Products> list, String grade) {
        ArrayList<Products> result = new ArrayList<>();
        for (Products product : list) {
            if (product.getSort().equals(grade)) {
                result.add(product);
            }
        }
        return result;
    }
}
