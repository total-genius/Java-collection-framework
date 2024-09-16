package _6_collections_util_class_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethodsExample2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivan", 100000);
        Employee emp2 = new Employee(2, "Elena", 120000);
        Employee emp3 = new Employee(3, "Mike", 200000);
        Employee emp4 = new Employee(4, "John", 235000);
        Employee emp5 = new Employee(5, "Jake", 135000);
        Employee emp6 = new Employee(6, "Andy", 165000);

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp6);
        list.add(emp2);
        list.add(emp5);
        list.add(emp4);
        list.add(emp3);

        /*
        Для того, чтобы можно было использовать метод
        сортировки  на созданных нами объектах, мы должны
        показать Java как нужно сравнивать наши объекты.
        Для этого нам необходимо либо реализовать в нашем
        классе интерфейс Comparable либо реализовать Comparator
         */
        Collections.sort(list);
        System.out.println(list);

        int index2 = Collections.binarySearch(list, new Employee(5, "Jake", 135000));
        System.out.println(index2);


        //Еще пару методов класса Collections
        List<Integer> integerList = new ArrayList<>();
        integerList.add(-3);
        integerList.add(8);
        integerList.add(12);
        integerList.add(-30);
        integerList.add(0);
        integerList.add(5);
        integerList.add(1);
        integerList.add(10);
        integerList.add(-20);
        integerList.add(150);
        integerList.add(19);
        Collections.sort(integerList);
        System.out.println(list);
        //разворот листа
        Collections.reverse(integerList);
        System.out.println(integerList);
        //размешать элементы листа
        Collections.shuffle(integerList);
        System.out.println(integerList);




        /*
        Также похожие методы есть в классе Arrays для
        работы с массивами
         */
        int[] arr = {-3, 8, 12, -30, 0, 5, 1, 10, -20, 150, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index3 = Arrays.binarySearch(arr, 10);
        System.out.println(index3);
    }
}
