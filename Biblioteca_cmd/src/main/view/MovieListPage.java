package main.view;

import main.model.Movie;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description:
 * @author: NikoLan
 * @create: 2018-07-20 00
 */
public class MovieListPage extends View{
    private LinkedHashSet movieListData = new LinkedHashSet();

    @Override
    public String page() {
        return super.showView(drawView());
    }

    public MovieListPage(LinkedHashSet movieListPage) {
        this.movieListData = movieListPage;
    }

    @Override
    protected String drawView() {
        Components components = new Components(60);
        String title = components.drawFrameTitle("Movie List");
        // String content = components.listComponent(movieListData, " Order   Movie_Name");
        String text = "";
        text = components.leftString(" Order   Book_Name", 60, "**");
        Iterator it = movieListData.iterator();
        while (it.hasNext()) {
            Movie bookItem = (Movie) it.next();
            if (bookItem.getMovieStatus() != 1) {
                text += components.leftString(" " + bookItem.getMovieOrder() + "   " + bookItem.getMovieName(), 60, "**");
            }
        }
        String bottom = components.drawFrameTitle("Movie End");
        String btn = components.drawFrameTitle("|3. Main Menu|");
        String tipMenu = components.cmdTip("Input 3 to Main Menu | Input Number to view Movie:");
//        String tip = components.cmdTip("Input Number to view Movie:");
        return title + text + bottom + tipMenu;
    }
}
