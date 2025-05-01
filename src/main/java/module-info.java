module com.example.test_repo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_repo to javafx.fxml;
    exports com.example.test_repo;
}