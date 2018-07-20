package main.model;

import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description: book storage
 * @author: NikoLan
 * @create: 2018-07-19 18
 */
public class BookSet {
    private  LinkedHashSet books = new LinkedHashSet();

    public LinkedHashSet getBooks() {
        return books;
    }

    public BookSet() {
        books.add(new Book("testBook1", 11111,"lan", 0, "2018"));
        books.add(new Book("testBook2", 11112,"lan", 0, "2018"));
        books.add(new Book("testBook3", 11113,"lan", 0, "2018"));
        books.add(new Book("testBook4", 11114,"lan", 0, "2018"));
        books.add(new Book("testBook5", 11115,"lan", 0, "2018"));
    }
}

