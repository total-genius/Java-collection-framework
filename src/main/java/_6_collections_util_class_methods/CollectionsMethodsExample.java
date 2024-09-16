package _6_collections_util_class_methods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethodsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        //двоичный поиск используется только на отсортированных массивах и коллекциях
        int index = Collections.binarySearch(list, 6);
        System.out.println(index);
    }
}
