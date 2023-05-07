package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;

    public String getAuthor() { return author; }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() { return publishYear; }

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getPublishYear();
    }
}
