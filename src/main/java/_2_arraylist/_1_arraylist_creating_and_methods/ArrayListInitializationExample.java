package _2_arraylist._1_arraylist_creating_and_methods;

import java.util.ArrayList;

public class ArrayListInitializationExample {
    public static void main(String[] args) {
        //Создание
        ArrayList<String> list = new ArrayList<>();
        //Добавление элементов в лист
        list.add("A");
        list.add("B");
        list.add("C");

        /*
        Создание листа с внутренним массивом, который имеет начальный
        размер на 200 элементов
         */
        ArrayList<String> list1 = new ArrayList<>(200);

        /*
        Создание листа с использованием другого листа
        list2 не ссылается на list. Это разные объекты.
         */
        ArrayList<String> list2 = new ArrayList<>(list);
    }
}
