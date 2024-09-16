package _9_hashmap._2_equals_and_hashcode_methods;

import java.util.HashMap;
import java.util.Map;

public class HashcodeExample {
    public static void main(String[] args) {
        /*
        Создадим мапу, где ключом будет тип Student
        а значением - его средний балл.
         */
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Elena", "Ivanova", 1);
        Student st3 = new Student("Petr", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 6.3);
        map.put(st3, 8.9);

        System.out.println(map);

        Student st4 = new Student("Petr", "Petrov", 4);
        //Проверим содержится ли такой студент в качестве ключа в мапе.
        boolean result = map.containsKey(st4);
        /*
        Елси hashcode не переопределен, то значение будет
        false, поскольку сначала происходит сравнение ключа
        по хешкоду и, если hashcode ключей равны, то уже
        происходит сравнение ключей по equals. Поэтому,
        при работе с HashMap нужно переопределять hashcode
        и equals у классов, чьи экземпляры будут использоваться
        в качестве ключей.
         */
        System.out.println(result);

        //Что возвращает hashCode()???
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        /*
        hashCode() - возвращает числовое представление
        объекта.
         */
    }
}
