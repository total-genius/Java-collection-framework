package _12_hashtable;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");
        System.out.println(hashtable);
    }
}
