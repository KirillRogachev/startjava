package src.com.startjava.graduation.bookshelf;

public class Bookshelf {

    private static final int SHELF_NUM = 10;
    private Book[] books = new Book[SHELF_NUM];
    private int firstEmptyShelf;
    private int maxRecordLen;

    public int getFirstEmptyShelf() { return firstEmptyShelf; }

    public void addBook(String author, String name, int publishYear) {
        books[firstEmptyShelf] = new Book(author, name, publishYear);
        if(books[firstEmptyShelf].getRecordLen() > maxRecordLen) {
            maxRecordLen = books[firstEmptyShelf].getRecordLen();
        }
        firstEmptyShelf++;
    }

    public String findBook(String titleToFind) {
        try {
            for (int i = 0; i < firstEmptyShelf; i++) {
                if (books[i].getTitle().equals(titleToFind)) {
                    return books[i].toString();
                }

            }
        } catch(NumberFormatException e) {
            System.out.println("Книга не найдена");
        }
        return null;
    }

    public void deleteBook (String title) {
        int deletedRecordLen = 0;
        for(int i = 0; i < firstEmptyShelf; i++) {
            if(books[i].getTitle().equals(title)) {
                deletedRecordLen = books[i].getRecordLen();
                books[i] = null;
                System.arraycopy(books, i + 1, books, i, firstEmptyShelf - i - 1);
                books[--firstEmptyShelf] = null;
                break;
            }
        }
        if(deletedRecordLen == maxRecordLen) {
            maxRecordLen = 0;
            for(int i = 0; i < firstEmptyShelf; i++) {
                if(books[i].getRecordLen() > maxRecordLen) {
                    maxRecordLen = books[i].getRecordLen();
                }
            }
        }
    }

    public void clear() {
        for(int i = 0; i < firstEmptyShelf; i++) {
            books[i] = null;
        }
        firstEmptyShelf = 0;
        maxRecordLen = 0;
    }

    public void showContent() {
        System.out.println("\nВ шкафу " + firstEmptyShelf + " книг(и) и свободно " + (SHELF_NUM - firstEmptyShelf) +
            " полок.\n");
        for(int i = 0; i < firstEmptyShelf; i++) {
            System.out.printf("|%-" + maxRecordLen + "s|\n", books[i]);
            System.out.println("|" + "-".repeat(maxRecordLen) + "|");
        }
        if(firstEmptyShelf < SHELF_NUM) {
            System.out.println("|" + " ".repeat(maxRecordLen) + "|");
        }
    }

}
