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
            System.out.println("\nВ шкафу " + bookshelf.getBooksNum() + " книг(и) и свободно " +
                    bookshelf.getEmptyShelvesNum() + " полок.\n");
            System.out.println("""
                    Введите номер действия из меню:
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Завершить
                    """);

            try{
                int selectedAction = Integer.parseInt(scanner.nextLine());
                switch (selectedAction) {
                    case 1:
                        System.out.print("Введите автора книги: ");
                        String author = scanner.nextLine();
                        System.out.print("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.print("Введите год издания: ");
                        while(true) {
                            try {
                                int publishYear = Integer.parseInt(scanner.nextLine());
                                bookshelf.addBook(author, title, publishYear);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Год должен быть введен в числовом формате");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Введите название книги, которую нужно найти: ");
                        System.out.println(bookshelf.findBook(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.print("Введите название книги, которую нужно удалить: ");
                        bookshelf.deleteBook(scanner.nextLine());
                        break;
                    case 4:
                        bookshelf.clear();
                        System.out.println(emptyBookshelf);
                        break;
                    case 5:
                        continueWork = false;
                        break;
                    default:
                        System.out.println("Введите значение от 1 до 5");
                        break;
                }
                System.out.print("\nДля продолжения работы нажмите Enter");
                scanner.nextLine();
                bookshelf.showContent();
            } catch(NumberFormatException e) {
                System.out.println("Введено недопустимое значение");
            }
        }
    }
}
