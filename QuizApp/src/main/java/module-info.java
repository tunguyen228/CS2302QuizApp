module com.nct.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.nct.quizapp to javafx.fxml;
    exports com.nct.quizapp;
}
