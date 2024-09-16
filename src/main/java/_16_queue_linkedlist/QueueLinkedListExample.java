package _16_queue_linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        /*
        Методы:

        add() - добавляет элемент в конец очереди
        offer() - тоже добавляет элемент в конец очереди

        В чем между ними разница?

        Если мы работаем с ограниченной очередью (будет позже пример)
        и добавляем туда через add() элемент, когда очередь уже заполнена,
        то вылетит исключение.
        При работе с offer() - нет, просто элемент не добавился бы
         */
        queue.add("Hello");
        queue.add("World");
        queue.offer("Java");
        queue.offer("Python");
        System.out.println(queue);
        System.out.println();

        /*
        remove()
        poll()
        оба метода удаляют первый элемент (принцип работы очереди).
        То же самое что и с методами удаления. При использовании remove() на
        пустой очереди, влетит исключение. При исползовании poll() - нет.
         */
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println();

        /*
        element() - показывает верхний элемент в очереди.
        на пустой очереди приведет к исключению
        peek() - не выбросит. Делает то же самое.
         */
        System.out.println(queue.element());
        System.out.println(queue.peek());

        /*
        При работе с очередью, в Java есть возможность удалить
        элемент из любого места в очереди. Просто в методе remove()
        в параметре нужно указать элемент. Но тогда весь смысл использования
        очереди теряется.
         */


    }
}
