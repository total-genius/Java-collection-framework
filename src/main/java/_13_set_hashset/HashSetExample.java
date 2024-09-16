package _13_set_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        /*
        При вызове метода add(), внутри вызывается метод
        put() мапы.
         */
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        System.out.println(set);

        //удаление
        set.remove("D");
        set.remove("E");
        System.out.println(set);

        //узнать размер
        System.out.println(set.size());

        //Проверка на пустоту
        System.out.println(set.isEmpty());

        //Проверка на наличие элемента
        System.out.println(set.contains("A"));




    }
}
