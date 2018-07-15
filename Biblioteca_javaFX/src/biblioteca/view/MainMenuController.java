package biblioteca.view;

import biblioteca.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class MainMenuController implements Initializable {

    private static Stage mainMenuStage = new Stage();

    public MainMenuController() {
    }

    public  void start(Stage primaryStage){
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("./MainMenu.fxml"));
            primaryStage.setTitle("主菜单");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openMainMenu() {
        start(this.mainMenuStage);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void openBookListFromMainMenu(ActionEvent actionEvent) {
        BookListController bookList = new BookListController();
        mainMenuStage.close();
        bookList.showWindow();
    }

    public void closeAppBtn() {
        MainApp.closeApp();
    }
}
