package _4_linkedlist._1_linkedlist_example;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Mike", 1);
        Student st4 = new Student("Elena", 4);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        System.out.println(studentLinkedList);
        Student student = studentLinkedList.get(2);
        System.out.println(student);
        Student student2 = studentLinkedList.getFirst();//Получение первого элемента связанного списка (головы)
        System.out.println(student2);
        Student student3 = studentLinkedList.getLast();//Получение последнего элемента связанного списака (хвоста)
        System.out.println(student3);

    }
}
