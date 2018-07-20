package main.model;

/**
 * @program: Biblioteca_cmd
 * @description: book base data
 * @author: NikoLan
 * @create: 2018-07-19 18
 */
public class Movie {
    private String movieName = "";
    private int movieOrder;
    private String movieAuthor = "";
    private int movieStatus;
    private String date = "";
    private int grade = 0;
    private String borrowName = null;

    public Movie(String movieName, int movieOrder, String movieAuthor, int movieStatus, String date, int grade) {
        this.movieName = movieName;
        this.movieOrder = movieOrder;
        this.movieAuthor = movieAuthor;
        this.movieStatus = movieStatus;
        this.date = date;
        this.grade = grade;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName;
    }

    public int getMovieOrder() {
        return movieOrder;
    }

    public String getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public String getMovieAuthor() {
        return movieAuthor;
    }

    public int getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(int movieStatus) {
        this.movieStatus = movieStatus;
    }
}
