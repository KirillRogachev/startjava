package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;
    private int recordLen;

    public String getTitle() {
        return title;
    }

    public int getRecordLen() {
        recordLen = (author + ", " + title + ", " + publishYear).length();
        return recordLen;
    }

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}
