package main.model;

/**
 * @program: Biblioteca_cmd
 * @description: user type infomation
 * @author: NikoLan
 * @create: 2018-07-19 12
 */
public class UserInfo {
    private String userType;
    private String userName;
    private String userPassward;
    private String books = "";
    private String movies = "";

    public UserInfo(String userType, String userName, String userPassward) {
        this.userType = userType;
        this.userName = userName;
        this.userPassward = userPassward;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getMovies() {
        return movies;
    }

    public String getBooks() {
        return books;

    }

    public String getUserPassward() {
        return userPassward;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public void setUserPassward(String userPassward) {
        this.userPassward = userPassward;
    }
}
