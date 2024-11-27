module com.example.man1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.man1 to javafx.fxml;
    exports com.example.man1;
}