package _17_priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(4);
        pq.add(9);
        pq.add(2);
        pq.add(5);
        pq.add(8);
        pq.add(7);
        pq.add(6);
        pq.add(3);
        pq.add(1);
        System.out.println(pq);
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println();
        System.out.println(pq);
        /*
        !!!Обращаем внимание, как элементы выводятся в консоль и
        каким образом при этом они удаляются и выводятся на консоль
        при помощи метода peek() - методы выводит первый элемент в очереди
        (более приоритетный). Внутри они не хранятся в отсортированной по приоритету
        порядке, но при этом используются по приоритету.
         */

    }
}
