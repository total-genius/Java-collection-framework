package _15_linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(8);
        System.out.println(set);
        set.remove(2);
        set.remove(4);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.contains(1));

    }
}
