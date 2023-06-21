package ru.geekbrains.lesson5.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class HW501 {
    public static void main(String[] args) {
        String str = "Россия идет впереди всей планеты. Планета — это не Россия.";
        System.out.println("\nТекст: " + '"' + str + '"');
        String findWord = "Россия";
        for (Map.Entry<String, Integer> entry : getMapFindWord(str, findWord).entrySet()) {
            System.out.println("\n" + "В тексте " + '"' + findWord + '"' + " встречается: " + entry.getValue() + " раз(а).");
        }
    }

    /**
     * @apiNote Подсчитать количество искомого слова, через map.
     * (Наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно.
     * (Усложнение - игнорировать пунктуацию)
     * @param str входная строка
     * @param findWord искомое слово
     * @return сформированный по условию словарь (набор пар “ключ-значение”)
     */
    private static Map<String, Integer> getMapFindWord(String str, String findWord) {
        Map<String, Integer> map = new HashMap<>();
        String[] s = str.toLowerCase().split("(?U)[\\pP\\s]");
        int i = 0;
        for (String value : s) {
            if (!value.isEmpty()) {
                if (!value.equals(findWord.toLowerCase())) {
                    map.put(findWord.toLowerCase(), 0);
                } else {
                    map.put(findWord.toLowerCase(), i + 1);
                    i++;
                }
            }
        }
        return map;
    }
}
