package ru.geekbrains.lesson6.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NotebookFilter extends Notebook {
    /**
     * @param notebooks входящий список ноутбуков
     * @param filters   критерии фильтрации через Map
     * @return отфильтрованный список ноутбуков
     */
    public static List<Notebook> filter(List<Notebook> notebooks, Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            for (String filterKey : filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                if (Objects.equals(filterKey, "manufacturer") &&
                        notebook.getManufacturer().toLowerCase().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "model") &&
                        notebook.getModel().toLowerCase().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "displaySize") &&
                        notebook.getDisplaySize().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "ramSize") &&
                        notebook.getRamSize().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "hddSize") &&
                        notebook.getHddSize().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "os") &&
                        notebook.getOs().toLowerCase().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "color") &&
                        notebook.getColor().toLowerCase().equals(filterValue)) {
                    filteredNotebooks.add(notebook);
                    break;
                } else if (Objects.equals(filterKey, "price") &&
                        notebook.getPrice() >= (int) filterValue) {
                            filteredNotebooks.add(notebook);
                    break;
                }
            }
        }
        return filteredNotebooks;
    }
}
