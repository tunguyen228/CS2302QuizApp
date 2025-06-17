package com.nct.quizapp;

import com.nct.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();    }
    
    public void handlePractice(ActionEvent event) {
         MyAlert.getInstance().showMsg("Practice: coming soon :3");
    }
}
