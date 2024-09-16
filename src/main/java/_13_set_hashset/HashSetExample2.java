package _13_set_hashset;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(10);
        hashSet.add(2);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(8);

        System.out.println(hashSet);

        /*
        Set является множеством. В матиматике имеются несколько
        операций, которые можно проводить над множествами.
         */

        //объединение множеств
        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println(union);

        //пересечение множеств
        HashSet<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);

        //разность
        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }
}
