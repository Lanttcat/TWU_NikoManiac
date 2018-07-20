package main.controller;

import main.model.*;
import main.view.*;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description: main controller
 * @author: NikoLan
 * @create: 2018-07-19 00
 */
public class MainController {

    private UserInfoData userInfoData = new UserInfoData();
    private UserInfo userInfo;
    private BookSet books = new BookSet();
    private MovieSet movies = new MovieSet();

    /**
     * 1. normal user
     * 2 manage user
     */
    private int userType;

    public MainController() {
        setToArray(books.getBooks());
        start();
    }

    /*
    * init page
    * **/
    public void welocomeView() {
        String userInput = new WelcomePage().page();
        userInputDealCenter(userInput);
    }

    private void start() {
        // data init
        UserInfoData userData = new UserInfoData();
        // view inti
        welocomeView();

    }

    private void errorDeal() {
        System.out.println("input Error!!! Bye");
        return;
    }
    /*
    * user password error deal
    * **/
    private void userInputError(int type) {
        System.out.println("Error! Please input again:");
        String name = new UserLoignPage().page();
        String pwd = new UserLoignPage().inputUserName();
        userLoginView(type, name, pwd, true);
    }

    /**
     * user login deal
     * */
    private void userLoginView(int type, String name, String pwd, Boolean isExit) {
        this.userType = type;
        if (type == 1) {
            userInfo = UserInfoData.getNormalUser();
        } else {
            userInfo = UserInfoData.getManageUser();
        }

        // The problem of logical existence is dealt with temporarily.
        if (isSearchPwdByName(userInfo, name, type) && pwd.equals(userInfo.getUserPassward())) {
            toMainMenu();
        } else {
            if (isExit) {
                System.out.println("Error exiting");
                return;
            }
            userInputError(type);
        }
    }

    private void userInputDealCenter(String input) {
        switch (input) {
            case "1" :
                String name1 = new UserLoignPage().page();
                String pwd1 = new UserLoignPage().inputUserName();
                userLoginView(1, name1, pwd1, false);
                break;
            case "2" :
                String name2 = new UserLoignPage().page();
                String pwd2 = new UserLoignPage().inputUserName();
                userLoginView(2, name2, pwd2, false);
                break;
            case "3" :
                toMainMenu();
                break;
            case  "exit":
                return;
            default:
                errorDeal();
                return;
        }
    }



    private void toMainMenu() {
        String mainMenuInput = new MainMenu().page();

        switch (mainMenuInput) {
            case "1":
                toBookList();
                break;
            case "2":
                toMovieList();
                break;
            case "5":
                toUserInfomation();
                break;
            case "exit":
                return;
            default:
                errorDeal();
                return;
        }
    }

    private void toUserInfomation() {
        String input = new UserInfomationPage(userInfo).page();
        switch (input) {
            case "3":
                toMainMenu();
            case "exit":
                return;
            default:
                if (!isStrToNum(input)) {
                    errorDeal();
                    return;
                }
                Book book = searchBookByOrder(input);
                Movie movie = searchMovieByOrder(input);
                if (book != null) {
                    book.setBorrowName(null);
                    userInfo.setBooks("");
                }

                if (movie != null) {
                    movie.setBorrowName(null);
                    userInfo.setMovies("");
                }

                UserInfomationPage.returnBorrowBook();
                toMainMenu();
        }
    }
    private void toBookList() {
        String input1 = new BookListPage(books.getBooks()).page();
        switch (input1) {
            case "3":
                toMainMenu();
            case "exit":
                return;
            default:
                if (!isStrToNum(input1)) {
                    errorDeal();
                    return;
                }
                toBookDetail(input1);
        }
    }

    private void toMovieList() {
        String input2 = new MovieListPage(movies.getMovies()).page();
        switch (input2) {
            case "3":
                toMainMenu();
            case "exit":
                return;
            default:
                if (!isStrToNum(input2)) {
                    errorDeal();
                    return;
                }
                toMovieDetail(input2);
        }
    }
    private void toMovieDetail(String input) {

        Movie movie = null;
        String movieDetailInput;
        Boolean isHaveMovie = false;
        Iterator it = movies.getMovies().iterator();

        while (it.hasNext()) {
            Movie movieItem = (Movie) it.next();
            if (movieItem.getMovieOrder() == Integer.parseInt(input)) {
                isHaveMovie = true;
                movie = movieItem;
            }
        }
        if (isHaveMovie) {
            movieDetailInput = new BookOrMovieDetail(movie).page();
        } else {
            movieDetailInput = new BookOrMovieDetail(movie).selectError();
        }
        switch (movieDetailInput ) {
            case "3":
                toMainMenu();
            case "4":
                movie.setMovieStatus(1);
                movie.setBorrowName(userInfo.getUserName());
                userInfo.setMovies(userInfo.getMovies() + movie.getMovieOrder() + " "+ movie.getMovieName() + " | ");
                BookOrMovieDetail.borrowBook();
                toMainMenu();
            case "exit":
                return;
            default:
                return;
        }
    }
    public void toBookDetail(String input) {
        Book book = null;
        String bookDetailInput;
        Boolean isHaveBook = false;
        Iterator it = books.getBooks().iterator();

        while (it.hasNext()) {
            Book bookItem = (Book)it.next();
            if (bookItem.getBookOrder() == Integer.parseInt(input)) {
                isHaveBook = true;
                book = bookItem;
            }

        }
        if (isHaveBook) {
            bookDetailInput = new BookOrMovieDetail(book).page();
        } else {
            bookDetailInput = new BookOrMovieDetail(book).selectError();
        }
        switch (bookDetailInput ) {
            case "3":
                toMainMenu();
            case "4":
                book.setBookStatus(1);
                book.setBorrowName(userInfo.getUserName());
                userInfo.setBooks(userInfo.getBooks() + book.getBookOrder() + " " + book.getBookName() + " | ");
                BookOrMovieDetail.borrowBook();
                toMainMenu();
            case "exit":
                return;
            default:
                return;
        }

    }

    public static boolean isStrToNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Object[] setToArray(LinkedHashSet data) {
        Object[] array =data.toArray();
        System.out.println((Book)array[0]);
        return array;
    }

    private Boolean isExit(String string) {
        return string.equals("exit") ? true : false;
    }

    public static Boolean isSearchPwdByName(UserInfo data, String name, int userType) {
        if (userType == 1) {
            return UserInfoData.getNormalUser().getUserName().equals(name) ? true : false;
        } else {
            return UserInfoData.getManageUser().getUserName().equals(name) ? true : false;
        }
    }

    public Book searchBookByOrder(String number) {
        Book book = null;
        Iterator it = books.getBooks().iterator();
        while (it.hasNext()) {
            Book bookItem = (Book) it.next();
            if (bookItem.getBookOrder() == Integer.parseInt(number)) {
                book = bookItem;
            }
        }
        return book;
    }

    public Movie searchMovieByOrder(String number) {
        Movie movie = null;
        Iterator it = movies.getMovies().iterator();
        while (it.hasNext()) {
            Movie movieItem = (Movie) it.next();
            if (movieItem.getMovieOrder() == Integer.parseInt(number)) {
                movie = movieItem;
            }
        }
        return movie;
    }

    //public removeItemInArray
}
