package biblioteca.view;

import biblioteca.model.Book;
import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import biblioteca.MainApp;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class BookListController implements Initializable {

    private static Stage bookListStage = new Stage();
    @FXML
    private TableView<Book> bookTableView;
    @FXML
    private TableColumn<Book, String> bookNameColumn;
    @FXML
    private TableColumn<Book, String> bookStatusColumn;

    public BookListController() {

    }

    public void start(Stage primaryStage){
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("./BookList.fxml"));
            primaryStage.setTitle("书籍列表");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL loaction, ResourceBundle resource) {
        bookNameColumn.setCellValueFactory(new PropertyValueFactory<>("BookName"));
        bookStatusColumn.setCellValueFactory(new PropertyValueFactory<>("BookStatus"));
        bookTableView.setItems(bookData);
    }

    /*
    * 添加测试数据
    * */
    ObservableList<Book> bookData = FXCollections.observableArrayList(
            new Book("测试1", "1")
    );

    public void showWindow() {
        start(this.bookListStage);
    }

    public void closeAppBtn() {
        MainApp.closeApp();
    }

    /*
    * 打开主菜单
    * */
    public void openMainMenuBtn() {
        MainMenuController mainMenu = new MainMenuController();
        bookListStage.close();
        mainMenu.openMainMenu();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
