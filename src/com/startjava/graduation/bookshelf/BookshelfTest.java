package src.com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        while(true) {
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Завершить
                    """);
            int selectedAction = scanner.nextInt();
            if (selectedAction == 1) {
                System.out.print("Введите автора книги: ");
                String author = scanner.next();
                System.out.print("Введите название книги: ");
                String title = scanner.next();
                System.out.print("Введите год издания: ");
                int publishYear = scanner.nextInt();
                bookshelf.addBook(author, title, publishYear);
            }
            if (selectedAction == 2) {
                System.out.print("Введите название книги, которую нужно найти: ");
                String title = scanner.next();
                System.out.println(bookshelf.findBook(title));
            }
            if (selectedAction == 3) {
                System.out.print("Введите название книги, которую нужно удалить: ");
                String title = scanner.next();
                bookshelf.deleteBook(title);
            }
            if (selectedAction == 4) {
                bookshelf.clearBookshelf();
            }
            if (selectedAction == 5) break;
        }
    }
}
