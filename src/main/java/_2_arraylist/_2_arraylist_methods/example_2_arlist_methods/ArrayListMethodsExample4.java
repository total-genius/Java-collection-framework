package _2_arraylist._2_arraylist_methods.example_2_arlist_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsExample4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        /*
        Arrays.asList(DataType[]) -> List<DataType>
        Получение листа из массива
         */
        StringBuilder[] arr = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(arr);
        System.out.println(list);
        /*
        !!!Отметим, что list будет всегда той же
        длины, что и массив arr. Лист полностью связан
        с массивом. Если мы попробуем изменить элемент в
        массиве arr или заменить его, то эти изменения отразятся
        также и на листе list
         */
        arr[0].append("!!!");
        System.out.println(list);
        arr[0] = new StringBuilder("G");
        System.out.println(list);

        /*
        removeAll(Collection<?> c) -> boolean
        удаление из одного листа элеметов, которые
        есть в другом листе
         */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("B");
        list3.add("C");
        list3.add("Z");
        System.out.println(list3);

        list2.removeAll(list3);
        System.out.println(list2);

        /*
        retainAll(Collection<?> c) -> boolean
        оставит те элеметы, которые есть в листе из параметра
         */
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");
        System.out.println(list4);

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("B");
        list5.add("C");
        list5.add("Z");
        System.out.println(list5);

        list4.retainAll(list5);
        System.out.println(list4);

        /*
        containsAll(Collection<?> c) -> boolean
         */

        /*
        subList(int fromIndex, int toIndex) -> List<E>
        создает из листа саблист, его отрезок
         */
        ArrayList<String> list6 = new ArrayList<>();
        list6.add("A");
        list6.add("B");
        list6.add("C");
        list6.add("D");
        list6.add("E");
        list6.add("F");
        System.out.println(list6);
        List<String> subList = list6.subList(1, 4);//второй индекс не включается
        System.out.println(subList);
        /*
        !!!subList не существует отдельно от list6 из
        которого он был создан. Он лишь является его
        представлением. Это не отдельная сущность.

        Попробуем добавить в subList какой нибудь элемент
         */
        subList.add("YYY");
        System.out.println(subList);
        System.out.println(list6);
        /*
        Добавленный эелемент отразиться и в sublist,
        и в list6. Причем, новый элемент добавился на конец нашего
        саблиста и в list6.
         */

        /*
        !!!Важный момент. Если после создания саблиста мы
        снова начали изменять основной лист не через саблист,
        а через основной лист, то при последующей попытке работы
        с саблистом мы получим исключение.
         */
        list6.add("!!!!!");
        System.out.println(list6);//отработает нормально
//        System.out.println(subList);//вылетит исключение

        //toArray() -> Object[] - лист в массив
        ArrayList<String> list7 = new ArrayList<>();
        list7.add("A");
        list7.add("B");
        list7.add("C");
        list7.add("D");
        list7.add("E");
        list7.add("F");
//        Object[] array = list7.toArray();

        //toArray(T[] a) -> T[]
        String[] srtArr = list7.toArray(new String[list7.size()]);
        /*
        В размере массива можно указать 0. Вот так:
        String[] srtArr = list7.toArray(new String[0]);
        Java сама создаст массив нужной длины
         */

        /*
        (Эти методы вышли после Java 8)

        List.of(E ... elements) -> List<E>
        List.copyOf(Collection<E> c> -> List<E>

        !!! листы, получаемые на выходе НЕИЗМЕНЯЕМЫЕ
         */
        List<Integer> list8 = List.of(3, 8, 10, 6);
        System.out.println(list8);

        List<String> list9 = List.copyOf(list7);
        System.out.println(list9);
        /*
        При использовании метода List.of(E ... elements)
        среди элементов НЕЛЬЗЯ указывать null. Вылетит исключение
         */
    }
}
