module org.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculator to javafx.fxml;
    exports org.example.calculator;
}