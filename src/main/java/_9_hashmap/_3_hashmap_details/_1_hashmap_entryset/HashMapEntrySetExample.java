package _9_hashmap._3_hashmap_details._1_hashmap_entryset;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySetExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);

        /*
        Рассмотрим метод entrySet();
        Метод возвращает множество типа Entry (это внутренний интерфейс для мапы
        который реализуется вложенным статическим классом Node)
        который каждый объект Entry содержит пары ключ значение и методы для
        манипуляции с ними.
         */
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
