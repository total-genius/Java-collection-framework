package _1_tasks.list.arraylist.task1;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем книги в библиотеку
        library.addBook("Мастер и Маргарита", "Михаил Булгаков");
        library.addBook("Преступление и наказание", "Федор Достоевский");
        library.addBook("1984", "Джордж Оруэлл");

        // Показываем доступные книги
        library.showAvailableBooks();

        // Выдаем книгу
        library.borrowBook("1984");

        // Пытаемся выдать ту же книгу еще раз
        library.borrowBook("1984");

        // Возвращаем книгу
        library.returnBook("1984");

        // Показываем доступные книги после возврата
        library.showAvailableBooks();
    }
}
