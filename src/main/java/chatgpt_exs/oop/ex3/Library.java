package chatgpt_exs.oop.ex3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void listBooks() {
        for(Book book : bookList) {
            System.out.println(book.getDetails());
        }
    }
}
