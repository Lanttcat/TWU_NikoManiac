package main.view;

import main.model.Book;
import main.model.Movie;

/**
 * @program: Biblioteca_cmd
 * @description: every book detail
 * @author: NikoLan
 * @create: 2018-07-19 21
 */
public class BookOrMovieDetail extends View{

    private Book bookItem;
    private Movie movieItem;
    int type;
    public BookOrMovieDetail(Book bookItem) {
        this.bookItem = bookItem;
        this.type = 0;
    }
    public BookOrMovieDetail(Movie movieItem) {
        this.movieItem = movieItem;
        this.type = 1;
    }
    @Override
    public String page() {
        return super.showView(drawView());
    }

    @Override
    protected String drawView() {
        String t = type == 0 ? "Book" : "Movie";
        String tname = type == 0 ? bookItem.getBookName() : movieItem.getMovieName();
        int torder = type == 0 ? bookItem.getBookOrder() : movieItem.getMovieOrder();
        String tauthor = type == 0? bookItem.getBookAuthor() : movieItem.getMovieAuthor();
        String tyear = type == 0? bookItem.getDate(): movieItem.getDate();
        Components components = new Components(60);
        String title = components.drawFrameTitle(t + " Detail Page");
        String name = components.leftString(t + " Name:   " + tname, 60, "**");
        String order = components.leftString(t + " Order:  " + torder,60, "**");
        String author = components.leftString(t + " Author: " + tauthor, 60, "**");
        String date = components.leftString(t + " Year: " + tyear, 60, "**");
        String bottom = components.drawFrameTitle(t + " Detail End");
        String menu = components.leftString("4. Borrowing 3.Main menu", 60, "**");
        return title + name + order + author + date + bottom + menu;
    }

    public String  selectError() {
        Components components = new Components(60);

        String tip = components.cmdTip("Not hava this number!");

        String content = drawView();
        return super.showView(tip + '\n' + content);
    }

    public static void borrowBook() {
        Components components = new Components(60);
        String tip = components.drawFrameTitle("Borrowing success!");
        System.out.println('\n' + tip + '\n');
    }
}
