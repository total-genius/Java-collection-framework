package _10_treemap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> students = new TreeMap<>();
        Student st1 = new Student("Ivan", 23, 3);
        Student st2 = new Student("Igor", 18, 1);
        Student st3 = new Student("Petr", 23, 3);
        Student st4 = new Student("Elena", 23, 4);
        Student st5 = new Student("Michael", 23, 5);
        Student st6 = new Student("David", 23, 6);
        Student st7 = new Student("John", 23, 4);
        Student st8 = new Student("Michael", 23, 5);

        //Рассмотрим методы treemap
        students.put(5.8, st1);
        students.put(6.7, st2);
        students.put(4.7, st3);
        students.put(8.6, st4);
        students.put(6.5, st5);
        students.put(9.4, st6);
        students.put(3.7, st7);
        students.put(8.8, st8);
        System.out.println(students);
        System.out.println(students.get(5.8));
        students.remove(5.8);
        System.out.println(students);

        //Разворот TreeMap в обратную строну
        System.out.println(students.descendingMap());
        System.out.println(students);

        //tailMap() - получить отрезок мапы, например список студентов, чей балл выше 6.0
        System.out.println(students.tailMap(6.0));
        //headMap() - получить отрезок мапы, например, список студентов, чей бал ниже 7.0
        System.out.println(students.headMap(7.0));
        //lastEntry() - получаем последний элемент (ключ-значение) в мапе
        //firstEntry() - первый элемент в мапе

    }
}
