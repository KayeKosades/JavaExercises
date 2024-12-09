package chatgpt_exs.oop.ex3;

public class Solution {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Том Сойер", "Марк Твен", 1879));
        library.addBook(new Book("Гарри Поттер и Философский камень", "Джоан Роулинг", 1998));
        library.addBook(new Book("Одиночество в сети", "Хз", 2003));

        library.listBooks();
    }

}