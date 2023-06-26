package ru.geekbrains.lesson6.classwork.ex604;

public class Ex604 {
    public static void main(String[] args) {
//4)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У классов наследников необходимо
// переопределить метод интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue"do

        double temp = 1.0;
        convZadanie(temp);
    }

    /**
     * @apiNote 4)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты. У классов наследников необходимо
     *  переопределить метод интерфейса, для валидного перевода величин.
     *  Метод для конвертации назовите "convertValue"do
     * @param temp температура по цельсию
     */
    private static void convZadanie(double temp) {
        System.out.println("temp Cel= " + new Cels().convertValue(temp));
        System.out.println("temp Kel= " + new Kelvin().convertValue(temp));
        System.out.println("temp Far= " + new Faren().convertValue(temp));
    }
}
