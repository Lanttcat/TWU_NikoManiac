package main.view;

/**
 * @program: Biblioteca_cmd
 * @description: main munu
 * @author: NikoLan
 * @create: 2018-07-19 23
 */
public class MainMenu extends View{

    @Override
    public String page() {
        return super.showView(drawView());
    }

    @Override
    public String drawView() {
        Components components = new Components(60);
        String title = components.drawFrameTitle("Main Menu");

        String bookBtn = components.centerString("1. Book list", 60, "**");
        String movieBtn = components.centerString("2. Movie list", 60, "**");
        String userBtn = components.centerString("5. user infomation", 60, "**");

        String bottom = components.drawFrameTitle("Main Menu End");
        return title + bookBtn + movieBtn + userBtn + bottom;
    }
}
