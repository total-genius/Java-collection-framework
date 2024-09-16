package _14_treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        //общие методы
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(3);
        set.add(4);
        set.add(7);
        set.add(8);
        System.out.println(set);
        set.remove(2);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(2));
        System.out.println(set.contains(8));

        System.out.println();
        System.out.println();

        //методы именно трисета
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        set2.add(2);
        set2.add(1);
        set2.add(5);
        set2.add(6);
        set2.add(3);
        set2.add(4);
        set2.add(7);
        set2.add(8);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.headSet(3));
        System.out.println(set2.tailSet(4));
        System.out.println(set2.subSet(3,6));

    }
}
