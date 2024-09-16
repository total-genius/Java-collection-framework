package _3_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        /*
        Итератор нужен для обхода коллекций.

        Пример обхода коллекции:
         */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {//Проверяем имеется ли следующий элемент
            System.out.println(iterator.next()); //получаем следующий элемент (храниться в переменной iterator)
//            iterator.remove();//удаляем полученный эелемент
        }



    }
}
