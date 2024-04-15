module com.example.polimorfismo_poo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.polimorfismo_poo to javafx.fxml;
    exports com.example.polimorfismo_poo;
    exports com.example.polimorfismo_poo.Controllers;
    opens com.example.polimorfismo_poo.Controllers to javafx.fxml;
}