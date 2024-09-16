package _9_hashmap._1_hashmap_ex_1;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        //добавление элементов
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);

        //добавить элемент, если такого в мапе нет, проверка происходит по ключу.
        map.putIfAbsent(3, "hello");//не добавится
        System.out.println(map);

        map.putIfAbsent(6, "five");
        System.out.println(map);//добавится

        //Получение значения по ключу
        System.out.println(map.get(3));

        //удаление элемента по ключу
        map.remove(3);
        System.out.println(map);

        //проверка содержание в мапе значения
        System.out.println(map.containsValue("five"));
        //проверка содержания ключа
        System.out.println(map.containsKey(1));

        //Получения множества всех ключей в мапе
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        //Получение множества значений
        List<String> values = (List<String>) map.values();
        System.out.println(values);
    }
}
