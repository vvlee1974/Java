package ru.geekbrains.lesson3.HomeWork.hw301;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Наивысший балл", 750, "1 сорт");
        Product product2 = new Product("Высший  пилотаж", 900, "2 сорт");
        Product product3 = new Product("Высший", 1500, "3 сорт");
        Product product4 = new Product("высший", 1450, "4 сорт");
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        System.out.println("maxPrice(listProduct) = " + maxPrice(listProduct));
}

    /**
     * @apiNote Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     * @param listProduct входной список товаров
     * @return наибольшая цена
     */
    private static Integer maxPrice(ArrayList<Product> listProduct) {
        int result = 0;
        for (Product product : listProduct) {
            if (product.getPrice() > result && product.getName().toLowerCase().contains("высший") &&
                    (product.getGrade() == "1 сорт" || product.getGrade() == "2 сорт")) {
                result = product.getPrice();
            }
        }
        return result;
    }
}
