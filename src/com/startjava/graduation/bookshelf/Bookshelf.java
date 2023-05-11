package src.com.startjava.graduation.bookshelf;

public class Bookshelf {

    private static final int SHELVES_NUM = 10;
    private Book[] books = new Book[SHELVES_NUM];
    private int booksNum;
    private int maxRecordLen;

    public int getBooksNum() {return booksNum;}

    public int getEmptyShelvesNum() {return (SHELVES_NUM - booksNum);}

    public void addBook(String author, String name, int publishYear) {
        try {
            books[booksNum] = new Book(author, name, publishYear);
            if (books[booksNum].getRecordLen() > maxRecordLen) {
                maxRecordLen = books[booksNum].getRecordLen();
            }
            booksNum++;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Книга не может быть сохранена. Шкаф полностью заполнен.");
        }
    }

    public String findBook(String titleToFind) {
            for (int i = 0; i < booksNum; i++) {
                if (books[i].getTitle().equals(titleToFind)) {
                    return books[i].toString();
                }
            }
            return "Книга не найдена";
    }

    public void deleteBook (String searchedTitle) {
        int deletedRecordLen = 0;
        boolean bookFound = false;
        for(int i = 0; i < booksNum; i++) {
            if(books[i].getTitle().equals(searchedTitle)) {
                deletedRecordLen = books[i].getRecordLen();
                books[i] = null;
                System.arraycopy(books, i + 1, books, i, booksNum - i - 1);
                books[--booksNum] = null;
                bookFound = true;
                break;
            }
        }
        if(!bookFound) {
            System.out.println("Книга не найдена");
        }
        if(deletedRecordLen == maxRecordLen) {
            maxRecordLen = 0;
            for(int i = 0; i < booksNum; i++) {
                if(books[i].getRecordLen() > maxRecordLen) {
                    maxRecordLen = books[i].getRecordLen();
                }
            }
        }
    }

    public void clear() {
        for(int i = 0; i < booksNum; i++) {
            books[i] = null;
        }
        booksNum = 0;
        maxRecordLen = 0;
    }

    public void showContent() {
        System.out.println();
        for(int i = 0; i < booksNum; i++) {
            System.out.printf("|%-" + maxRecordLen + "s|\n", books[i]);
            System.out.println("|" + "-".repeat(maxRecordLen) + "|");
        }
        if(booksNum < SHELVES_NUM) {
            System.out.println("|" + " ".repeat(maxRecordLen) + "|");
        }
    }

}
