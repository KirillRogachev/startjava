package src.com.startjava.graduation.bookshelf;

public class Bookshelf {

    private int booksQuantity;
    private Book[] books = new Book[10];
    private int lastBookIndex = 0;

    public void addBook(String author, String name, int yearOfPublication) {
        books[lastBookIndex++] = new Book(author, name, yearOfPublication);
    }

    public Book findBook(String nameToFind) {
        try {
            for (Book book : books) {
                if (book.getTitle().equals(nameToFind)) {
                    return book;
                }

            }
        } catch(NumberFormatException e) {
            System.out.println("Книга не найдена");
        }
        return null;
    }

    public void deleteBook (String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book = null;
            }
        }
    }

    public void clearBookshelf() {

    }
}
