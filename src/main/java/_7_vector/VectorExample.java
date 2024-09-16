package _7_vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //рассмотрим основные методы вектора
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(1);
        System.out.println(vector);
        System.out.println(vector.get(3));

    }
}
