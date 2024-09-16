package _2_arraylist._2_arraylist_methods.example_2_arlist_methods;

import java.util.ArrayList;

public class ArrayListMethodsExample2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Maria", 'f', 23, 3, 7.4);
        Student student6 = new Student("Elena", 'f', 19, 1, 8.9);

        //student6 такой же, как и student3 (но это разные объекты с одинаковым состоянием)
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        /*
        !!!ДО ПЕРЕОПРЕДЕЛЕНИЯ МЕТОДА equals в классе Student
        Попробуем удалить из коллекции объект с таким же сосотоянием как у student6 (это student3)
         */

//        students.remove(student6);
//        System.out.println(students);

        /*
        student3 не удалится.
        Почему?
        Когда мы удаляем элемент по объекту,
        а не индексу, то происходит поиск этого эелмента с помощью метода
        equals().

        (Поэтому в классе Student нужно переопределить метод equals())
        (Пример выше и его описание были сделаны до переопределения метода equals)
         */

        //!!!ПОСЛЕ ПЕРЕОПРЕДЕЛЕНИЯ equals
        students.remove(student6);
        System.out.println(students);
    }
}
