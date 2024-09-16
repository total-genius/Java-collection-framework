package _18_deque_arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        /*
        Все нижеописанные методы нам уже знакомы
         */
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        deque.offerFirst(7);
        deque.offerFirst(8);
        deque.offerFirst(9);

        deque.offerLast(10);
        deque.offerLast(11);
        deque.offerLast(12);

        System.out.println(deque);
        System.out.println();

        deque.removeFirst();
        System.out.println(deque);
        System.out.println();

        deque.pollFirst();
        System.out.println(deque);
        System.out.println();

        deque.removeLast();
        System.out.println(deque);
        System.out.println();

        deque.pollLast();
        System.out.println(deque);
        System.out.println();

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
