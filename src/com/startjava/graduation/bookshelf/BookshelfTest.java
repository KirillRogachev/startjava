package src.com.startjava.graduation.bookshelf;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookshelfTest {

    private static String emptyBookshelf = "Шкаф пуст. Вы можете добавить в него первую книгу";
    private static boolean continueWork = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        System.out.println(emptyBookshelf);
        while(continueWork) {
            System.out.println("\nВ шкафу " + bookshelf.getNumBooks() + " книг(и) и свободно " +
                    bookshelf.getNumEmptyShelves() + " полок.\n");
            printMenu();
            try {
                int selectedAction = Integer.parseInt(scanner.nextLine());
                performAction(bookshelf, selectedAction, scanner);
                System.out.print("\nДля продолжения работы нажмите Enter");
                scanner.nextLine();
                printBookshelf(bookshelf);
            } catch(NumberFormatException e) {
                System.out.println("Введено недопустимое значение");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                    Введите номер действия из меню:
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Завершить
                    """);
    }

    private static void performAction(Bookshelf bookshelf, int selectedAction, Scanner scanner) {
        switch (selectedAction) {
            case 1 -> inputBookData(bookshelf, scanner);
            case 2 -> {
                System.out.print("Введите название книги, которую нужно найти: ");
                try {
                    System.out.println(bookshelf.find(scanner.nextLine()).toString());
                } catch(NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> {
                System.out.print("Введите название книги, которую нужно удалить: ");
                bookshelf.delete(scanner.nextLine());
            }
            case 4 -> {
                bookshelf.clear();
                System.out.println(emptyBookshelf);
            }
            case 5 -> continueWork = false;
            default -> System.out.println("Введите значение от 1 до 5");
        }
    }

    private static void inputBookData(Bookshelf bookshelf, Scanner scanner) {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите год издания: ");
        while(true) {
            try {
                int publishYear = Integer.parseInt(scanner.nextLine());
                Book book = new Book(author, title, publishYear);
                bookshelf.add(book);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Год должен быть введен в числовом формате");
            }
        }
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        Book[] books = bookshelf.getAllBooks();
        int booksNum = bookshelf.getNumBooks();
        int maxLength = bookshelf.getMaxLength();
        System.out.println();
        for(int i = 0; i < bookshelf.getNumBooks(); i++) {
            System.out.printf("|%-" + maxLength + "s|\n", books[i]);
            System.out.println("|" + "-".repeat(maxLength) + "|");
        }
        if(booksNum < Bookshelf.SHELVES_NUM) {
            System.out.println("|" + " ".repeat(maxLength) + "|");
        }
    }
}
