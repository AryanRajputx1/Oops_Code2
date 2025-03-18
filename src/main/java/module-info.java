module com.example.inheritancepolymorphisimencapsulation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inheritancepolymorphisimencapsulation to javafx.fxml;
    exports com.example.inheritancepolymorphisimencapsulation;
}