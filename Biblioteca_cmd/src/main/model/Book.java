package main.model;

/**
 * @program: Biblioteca_cmd
 * @description: book base data
 * @author: NikoLan
 * @create: 2018-07-19 18
 */
public class Book {
    private String bookName = "";
    private int bookOrder;
    private String bookAuthor = "";
    private int bookStatus;
    private String date = "";
    private String borrowName = null;

    public Book(String bookName, int bookOrder, String bookAuthor, int bookStatus, String date) {
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bookAuthor = bookAuthor;
        this.bookStatus = bookStatus;
        this.date = date;

    }

    public String getBookName() {
        return bookName;
    }

    public int getBookOrder() {
        return bookOrder;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName;
    }

    public String getDate() {
        return date;
    }

    public int getBookStaus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }
}
