package src.com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public Book(String author, String name, int yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }
}
