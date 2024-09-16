package _8_stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //рассмотрим методы стека
        Stack<String> stack = new Stack<String>();
        stack.push("A");//добаление элемента в стек наверх
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);

        System.out.println(stack.pop());//вытаскивает верхний элемент и удаляет его из стека
        System.out.println(stack.pop());
        System.out.println(stack);
        /*
        pop() на пустом стеке вызовет исключение
         */

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }

        stack.push("E");
        stack.push("F");
        stack.push("G");
        stack.push("H");
        stack.push("I");
        stack.push("J");
        System.out.println(stack.peek());//показывает, какой элемент находится на верху стека, не удаляя его из стека

    }
}
