package _2_arraylist._2_arraylist_methods.example_2_arlist_methods;

import java.util.ArrayList;

public class ArrayListMethodsExample3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //Добалвение в лист элементов другого листа (добавятся в конец)
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!");
        list2.add("!!");
        list2.add("!!!");
        list2.addAll(list);
        System.out.println(list2);

        /*
        Добалвение в лист элементов другого листа
        (можем добавить в любое место, указав индекс с которого начать)
         */
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("?");
        list3.add("??");
        list3.add("???");
        list3.add("????");
        list3.add("?????");
        list3.addAll(2, list2);
        System.out.println(list3);

        //очистка листа
        list3.clear();
        System.out.println(list3);

        /*
        Возврат позиции объекта (первое совпадение с начала)
        сравнение осуществляется с помощью метода equals()
         */
        int index = list2.indexOf("!!");
        System.out.println(index);

        /*
        Возврат позиции объекта (первое совпадение с конца)
        сравнение осуществляется с помощью метода equals
         */
        int index2 = list2.lastIndexOf("!!");
        System.out.println(index2);

        //Узнать размер коллекции
        System.out.println(list2.size());

        //Проверка, пустая ли коллекция
        boolean isEmpty = list3.isEmpty();
        System.out.println(isEmpty);

        /*
        Проверка на наличие объекта в коллекции
        (первое совпадение) -> boolean
        Сравнение с помощью метода equals
         */
        boolean contains = list.contains("A");
        System.out.println(contains);




    }
}
