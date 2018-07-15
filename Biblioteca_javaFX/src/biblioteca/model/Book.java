package biblioteca.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
    private final SimpleStringProperty bookName;
    private final SimpleStringProperty bookStatus;

    public Book(String bName, String bStatus) {
        this.bookName = new SimpleStringProperty(bName);
        this.bookStatus = new SimpleStringProperty(bStatus);
    }

    public String getBookName() {
        return bookName.get();
    }

    public String getBookStatus() {
        return bookStatus.get();
    }

    public void setBookName(String bookName) {
        this.bookName.set(bookName);
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus.set(bookStatus);
    }

    public StringProperty bookNameProperty() {
        return bookName;
    }

    public StringProperty bookStatusProperty() {
        return bookStatus;
    }
}
