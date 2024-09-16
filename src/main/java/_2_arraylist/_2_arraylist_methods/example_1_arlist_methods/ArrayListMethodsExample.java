package _2_arraylist._2_arraylist_methods.example_1_arlist_methods;

import java.util.ArrayList;

public class ArrayListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //Получение элемента по индексу
        String s1 = list.get(0);
        String s2 = list.get(1);
        System.out.println(s1);
        System.out.println(s2);

        //Добавление элемента на определенный индекс
        list.add(2,"E");
        /*
        !!!Например у нашего листа capacity = 10, а size = 5
        Нельзя добавить при этом новый элемент на индекс 7,
        вылетит исключение, поскольку size = 5.
         */

        //Замена существующего элемента на новый
        System.out.println(list.get(2));
        list.set(2, "F");
        System.out.println(list.get(2));

        //Удаление элемента либо по индексу либо по самомму элементу
        list.remove(0);
        list.add("C");
        //Удалится первое совпадение
        list.forEach(e -> System.out.print(e+" "));
        list.remove("C");
        System.out.println();
        list.forEach(e -> System.out.print(e+" "));

    }
}
