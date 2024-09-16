package _1_tasks.list.arraylist.task1;
// Класс Book, представляющий книгу
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;  // Статус книги: доступна или выдана

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;  // По умолчанию книга доступна
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Книга: " + title + " | Автор: " + author + " | Статус: " + (isAvailable ? "Доступна" : "Выдана");
    }
}
