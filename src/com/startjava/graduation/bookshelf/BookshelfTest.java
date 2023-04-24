package src.com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        System.out.println("""
                          1. delete <title>
                          2. clear
                          3. save <author> <title> <publishYear>
                          4.  quit

                          """);
    }
}
