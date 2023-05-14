package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;
    private int length;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() { return length; }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}
