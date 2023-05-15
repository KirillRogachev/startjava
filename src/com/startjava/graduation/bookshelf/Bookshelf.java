package src.com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Bookshelf {

    public static final int SHELVES_NUM = 10;
    private Book[] books = new Book[SHELVES_NUM];
    private int numBooks;
    private int maxLength;

    public Book[] getAllBooks() { return books; }

    public int getNumBooks() { return numBooks; }

    public int getMaxLength() { return maxLength; }

    public int getNumEmptyShelves() { return (SHELVES_NUM - numBooks); }

    public void add(Book book) {
        if(numBooks >= SHELVES_NUM) {
            System.out.println("Книга не может быть сохранена. Шкаф полностью заполнен.");
        } else {
            books[numBooks] = book;
            checkLength(numBooks++);
        }
    }

    public Book find(String title) {
        for(int i = 0; i < numBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        throw new NoSuchElementException("Книга не найдена");
    }

    public void delete(String title) {
        int deletedRecordLength = 0;
        boolean bookFound = false;
        for(int i = 0; i < numBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                deletedRecordLength = books[i].getLength();
                System.arraycopy(books, i + 1, books, i, numBooks - i - 1);
                books[--numBooks] = null;
                bookFound = true;
                break;
            }
        }
        if(!bookFound) {
            System.out.println("Книга не найдена");
        } else if(deletedRecordLength == maxLength) {
            maxLength = 0;
            for(int i = 0; i < numBooks; i++) {
                checkLength(i);
            }
        }
    }

    public void clear() {
        Arrays.fill(books, 0, numBooks - 1, null);
        numBooks = 0;
        maxLength = 0;
    }

    private void checkLength(int i) {
        if(books[i].getLength() > maxLength) {
            maxLength = books[i].getLength();
        }
    }
}
