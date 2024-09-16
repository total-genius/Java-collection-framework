package _11_linkedhashmap;


import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2);
        Student st2 = new Student("Igor", 3);
        Student st3 = new Student("Petr", 4);
        Student st4 = new Student("Egor", 1);
        Student st5 = new Student("Elena", 2);
        Student st6 = new Student("Maria", 3);

        LinkedHashMap<Double, Student> studentLinkedHashMap = new LinkedHashMap<>();
        studentLinkedHashMap.put(5.8, st1);
        studentLinkedHashMap.put(3.9, st2);
        studentLinkedHashMap.put(4.5, st3);
        studentLinkedHashMap.put(8.9, st4);
        studentLinkedHashMap.put(6.9, st5);
        studentLinkedHashMap.put(7.9, st6);
        //Элементы выведутся в порядке их добавления
        System.out.println(studentLinkedHashMap);
        System.out.println();


        //элементы будут харниться в порядке добавления
        LinkedHashMap<Double, Student> map = new LinkedHashMap<>(16, 0.75f, false);
        map.put(5.8, st1);
        map.put(3.9, st2);
        map.put(4.5, st3);
        map.put(8.9, st4);
        map.put(6.9, st5);
        map.put(7.9, st6);
        System.out.println(map);
        System.out.println(map.get(3.9));
        System.out.println(map.get(8.9));
        System.out.println(map);
        System.out.println();

        /*
        /Поменяем accessOrder на true. Теперь элементы будут храниться в порядке использования
        элементов (они перейдут в конец мапы в порядке использования)
         */
        LinkedHashMap<Double, Student> map2 = new LinkedHashMap<>(16, 0.75f, true);
        map2.put(5.8, st1);
        map2.put(3.9, st2);
        map2.put(4.5, st3);
        map2.put(8.9, st4);
        map2.put(6.9, st5);
        map2.put(7.9, st6);
        System.out.println(map2);
        System.out.println(map2.get(5.8));
        System.out.println(map2.get(8.9));
        System.out.println(map2);
    }
}
