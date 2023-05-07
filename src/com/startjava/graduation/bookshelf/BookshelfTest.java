package src.com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        String emptyBookshelf = "Шкаф пуст. Вы можете добавить в него первую книгу";
        System.out.println(emptyBookshelf);
        boolean continueWork = true;
        while(continueWork) {
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Завершить
                    """);
            int selectedAction = Integer.parseInt(scanner.nextLine());
            switch (selectedAction) {
                case 1:
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите год издания: ");
                    int publishYear = Integer.parseInt(scanner.nextLine());
                    bookshelf.addBook(author, title, publishYear);
                    break;
                case 2:
                    System.out.print("Введите название книги, которую нужно найти: ");
                    title = scanner.nextLine();
                    System.out.println(bookshelf.findBook(title));
                    break;
                case 3:
                    System.out.print("Введите название книги, которую нужно удалить: ");
                    title = scanner.nextLine();
                    bookshelf.deleteBook(title);
                    break;
                case 4:
                    bookshelf.clear();
                    System.out.println(emptyBookshelf);
                    break;
                case 5:
                    continueWork = false;
                    break;
                default:
                    break;
            }
            System.out.print("Для продолжения работы нажмите Enter");
            scanner.nextLine();
            bookshelf.showContent();
        }
    }
}
