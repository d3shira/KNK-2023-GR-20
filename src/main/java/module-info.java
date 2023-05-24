module com.example.projekti_knk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens com.example.projekti_knk to javafx.fxml;
    opens controller to javafx.fxml; // Dafina B: e shtova

    exports com.example.projekti_knk;

    exports service;
    exports models;
    exports repository;
    exports controller;

    requires java.desktop;

}