package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;

    public String getTitle() {
        return title;
    }

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }
}
