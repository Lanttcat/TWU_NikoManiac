package biblioteca;

import biblioteca.view.BookListController;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import javafx.fxml.Initializable;

import java.net.ResponseCache;
import java.net.URL;
import java.util.ResourceBundle;

public class MainAppController implements Initializable {
    public MainAppController() {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    public void enterBookList() {
        try {
            BookListController bookList =new BookListController();
            System.out.println("dddd");
            bookList.showWindow();

            MainApp.closeWelcomeStage();
        } catch (Exception e) {
            //e.printStackTrace();
        }


    }

}
