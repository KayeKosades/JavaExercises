package chatgpt_exs.oop.ex3;

public class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getDetails() {
        return String.format("%s, %s, %d", title, author, year);
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }
}
