package _5_listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Приведем простой пример использования ListIterator
Возьмем строку и проверим, является ли она
полиндромом
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: str.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> headIterator = list.listIterator();//по умолчанию начинает с 0 позиции
        ListIterator<Character> taleIterator = list.listIterator(list.size());//здесь мы указываем с какой позиции начать перебор (указали конец коллекции, чтобы пойти в обратном порядке.)
        boolean isPalindrome = true;
        while (headIterator.hasNext() && taleIterator.hasPrevious()) {
            char headCh = headIterator.next();
            char taleCh = taleIterator.previous();
            if (headCh != taleCh) {
                isPalindrome = false;
                return;
            }
        }
        System.out.println(str +" is palindrome : " + isPalindrome);

    }
}
