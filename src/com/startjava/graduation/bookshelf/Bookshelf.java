package src.com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int SHELVES_NUM = 10;
    private Book[] books = new Book[SHELVES_NUM];
    private int booksNum;
    private int maxLength;

    public Book[] getAllBooks() { return books; }

    public int getBooksNum() { return booksNum; }

    public int getMaxLength() { return maxLength; }

    public int getEmptyShelvesNum() { return (SHELVES_NUM - booksNum); }

    public void add(String author, String name, int publishYear) {
        if(booksNum >= SHELVES_NUM) {
            System.out.println("Книга не может быть сохранена. Шкаф полностью заполнен.");
        } else {
            books[booksNum] = new Book(author, name, publishYear);
            if(books[booksNum].getLength() > maxLength) {
                maxLength = books[booksNum].getLength();
            }
            booksNum++;
        }
    }

    public Book find(String title) {
            for(int i = 0; i < booksNum; i++) {
                if(books[i].getTitle().equals(title)) {
                    return books[i];
                }
            }
            throw new IllegalArgumentException("Книга не найдена");
    }

    public void delete(String title) {
        int deletedRecordLength = 0;
        boolean bookFound = false;
        for(int i = 0; i < booksNum; i++) {
            if(books[i].getTitle().equals(title)) {
                deletedRecordLength = books[i].getLength();
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
        if(deletedRecordLength == maxLength) {
            maxLength = 0;
            for(int i = 0; i < booksNum; i++) {
                if(books[i].getLength() > maxLength) {
                    maxLength = books[i].getLength();
                }
            }
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        booksNum = 0;
        maxLength = 0;
    }
}
