package _1_tasks.list.arraylist.task1;

import java.util.ArrayList;
import java.util.List;

// Класс Library для управления библиотекой
public class Library {
    private List<Book> books = new ArrayList<>();  // Список книг

    // Метод для добавления новой книги
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Книга добавлена: " + title);
    }

    // Метод для поиска книги по названию
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Книга с названием '" + title + "' не найдена.");
        return null;
    }

    // Метод для выдачи книги читателю
    public void borrowBook(String title) {
        Book book = findBook(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Книга '" + title + "' успешно выдана.");
        } else if (book != null) {
            System.out.println("Книга '" + title + "' уже выдана.");
        }
    }

    // Метод для возврата книги в библиотеку
    public void returnBook(String title) {
        Book book = findBook(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Книга '" + title + "' успешно возвращена в библиотеку.");
        } else if (book != null) {
            System.out.println("Книга '" + title + "' уже находится в библиотеке.");
        }
    }

    // Метод для отображения всех доступных книг
    public void showAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
