package com.mycompany.quizapp;

import com.mycompany.quizapp.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Questions.fxml")).load());
        Stage stage = new Stage();
        stage.setTitle("Quiz App");
        stage.setScene(scene);
        stage.show();
        //MyAlert.getInstance().showMsg("Question management: Coming soon...");
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quiz App");
//        alert.setContentText("Question management: Coming soon...");
//        alert.showAndWait();
    }
    
    public void handlePractice(ActionEvent event) {
          MyAlert.getInstance().showMsg("Practice: Coming soon...");
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quiz App");
//        alert.setContentText("Practice: Coming soon...");
//        alert.showAndWait();
    }
    
    public void handleTest(ActionEvent event) {
        MyAlert.getInstance().showMsg("Final test: Coming soon...");
    }
}
