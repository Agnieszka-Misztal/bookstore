package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;

import java.util.Arrays;
import java.util.List;

public class BookManager {

    public static List<Book> createBooks() {
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz", 20.50, "klasyka", 5.6);
        Book book2 = new Book("Dziady", "Adam Mickiewicz", 15.50, "klasyka", 7.3);
        Book book3 = new Book("Latarnik", "Ernest Hemingway", 5.50, "klasyka", 8.2);
        Book book4 = new Book("Gra o tron", "George R.R. Martin", 30.50, "fantastyka", 9.2);
        Book book5 = new Book("Amerykańscy bogowie", "Neil Gaiman", 20.50, "fantastyka", 9.4);

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);

        return books;
    }

}
