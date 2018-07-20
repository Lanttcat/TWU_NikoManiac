package main.view;

import main.model.UserInfo;

/**
 * @program: Biblioteca_cmd
 * @description: user infomation page
 * @author: NikoLan
 * @create: 2018-07-20 14
 */
public class UserInfomationPage extends View{

    private UserInfo userInfo = null;
    public UserInfomationPage(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String page() {
        return super.showView(drawView());
    }

    @Override
    public String drawView() {
        Components components = new Components(60);
        String title = components.drawFrameTitle("User Infomation Page");
        String name = components.leftString("  user name: " + userInfo.getUserName(), 60, "**");
        String type = components.leftString("  user type: " + userInfo.getUserType(), 60, "**");
        String books = components.leftString("  borrowed book: " + userInfo.getBooks(), 60, "**");
        String movies = components.leftString("  borrowed movies: " + userInfo.getMovies(), 60, "**");
        String bottom = components.drawFrameTitle("User Infomation End");
        String tipMenu = components.cmdTip("Input 3 to Main Menu | Input Number to return book:");
        return title + name + type + books + movies + bottom + tipMenu;
    }

    public static void returnBorrowBook() {
        Components components = new Components(60);
        String tip = components.drawFrameTitle("return borrow success!");
        System.out.println('\n' + tip + '\n');
    }
}
