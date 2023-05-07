package src.com.startjava.graduation.bookshelf;

public class Bookshelf {

    private static final int SHELF_NUM = 10;
    private Book[] books = new Book[SHELF_NUM];
    private int firstEmptyShelf;
    private int maxRecordLen;

    public void addBook(String author, String name, int publishYear) {
        books[firstEmptyShelf] = new Book(author, name, publishYear);
        if(books[firstEmptyShelf].toString().length() > maxRecordLen) {
            maxRecordLen = books[firstEmptyShelf].toString().length();
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
                deletedRecordLen = books[i].toString().length();
                books[i] = null;
                System.arraycopy(books, i + 1, books, i, firstEmptyShelf - i - 1);
                books[--firstEmptyShelf] = null;
                break;
            }
        }
        if(deletedRecordLen == maxRecordLen) {
            maxRecordLen = 0;
            for(int i = 0; i < firstEmptyShelf; i++) {
                if(books[i].toString().length() > maxRecordLen) {
                    maxRecordLen = books[i].toString().length();
                }
            }
        }
    }

    public void clear() {
        for(int i = 0; i < firstEmptyShelf; i++) {
            books[i] = null;
        }
    }

    public void showContent() {
//        String Separator = "-";
//        for(int i = 1; i < maxRecordLength; i++) {
//            Separator += "-";
//        }
        for(int i = 0; i < firstEmptyShelf; i++) {
            System.out.printf("|%-" + maxRecordLen + "s|\n", books[i]);
            //System.out.printf("|%-" + maxRecordLength + "s|\n", Separator);
            System.out.println("|" + "-".repeat(maxRecordLen) + "|");
        }
        if(firstEmptyShelf < SHELF_NUM) {
            System.out.println("|" + " ".repeat(maxRecordLen) + "|");
        }
    }

}
