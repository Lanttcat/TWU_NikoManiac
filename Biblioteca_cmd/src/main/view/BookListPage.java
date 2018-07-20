package main.view;

import main.model.Book;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description: book list page
 * @author: NikoLan
 * @create: 2018-07-19 17
 */
public class BookListPage extends View{

    private LinkedHashSet bookListData = new LinkedHashSet();

    @Override
    public String page() {
        return super.showView(drawView());
    }

    public BookListPage(LinkedHashSet bookListData) {
        this.bookListData = bookListData;
    }

    @Override
    protected String drawView() {
        Components components = new Components(60);
        String title = components.drawFrameTitle("Book List");
        // String content = components.listComponent(bookListData, " Order   Book_Name");
        String text = "";
        text = components.leftString(" Order   Book_Name", 60, "**");
        Iterator it = bookListData.iterator();
        while (it.hasNext()) {
            Book bookItem = (Book) it.next();
            if (bookItem.getBookStaus() != 1) {
                text += components.leftString(" " + bookItem.getBookOrder() + "   " + bookItem.getBookName(), 60, "**");
            }
        }

        String bottom = components.drawFrameTitle("Book End");
        String tipMenu = components.cmdTip("Input 3 to Main Menu | Input Number to view Movie:");
        // String tip = components.cmdTip("Input Number to view book:");
        return title + text + bottom + tipMenu;
    }

}

