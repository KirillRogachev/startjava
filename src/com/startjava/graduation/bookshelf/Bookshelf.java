package src.com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Bookshelf {

    public static final int NUM_SHELVES = 10;
    private Book[] books = new Book[NUM_SHELVES];
    private int numBooks;
    private int maxLength;

    public Book[] getAllBooks() { return books; }

    public int getNumBooks() { return numBooks; }

    public int getMaxLength() { return maxLength; }

    public int getNumEmptyShelves() { return (NUM_SHELVES - numBooks); }

    public void add(Book book) {
        if(numBooks >= NUM_SHELVES) {
            System.out.println("Книга не может быть сохранена. Шкаф полностью заполнен.");
        } else {
            books[numBooks] = book;
            calculateMaxLength(numBooks++);
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
                calculateMaxLength(i);
            }
        }
    }

    public void clear() {
        Arrays.fill(books, 0, numBooks, null);
        numBooks = 0;
        maxLength = 0;
    }

    private void calculateMaxLength(int i) {
        if(books[i].getLength() > maxLength) {
            maxLength = books[i].getLength();
        }
    }
}
