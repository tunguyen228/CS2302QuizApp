package com.mycompany.quizapp;

import com.mycompany.quizapp.utils.MyAlert;
import com.mycompany.quizapp.utils.MyStage;
import com.mycompany.quizapp.utils.theme.DarkThemeFactory;
import com.mycompany.quizapp.utils.theme.DefaultThemeFactory;
import com.mycompany.quizapp.utils.theme.LightThemeFactory;
import com.mycompany.quizapp.utils.theme.Theme;
import com.mycompany.quizapp.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {
    @FXML private ComboBox<Theme> cbTheme;
    
    public void handleQuestionManagement(ActionEvent event) throws IOException { 
        MyStage.getInstance().showStage("Questions.fxml");
//        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Questions.fxml")).load());
//        Stage stage = new Stage();
//        stage.setTitle("Quiz App");
//        stage.setScene(scene);
//        stage.show();
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
    
    public void handleTheme(ActionEvent event) {
        this.cbTheme.getSelectionModel().getSelectedItem().updateTheme();
        
//        switch(this.cbTheme.getSelectionModel().getSelectedItem()) {
////            case DARK:
////                ThemeManager.setThemeFactory(new DarkThemeFactory());
//////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
//////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
////                break;
////            case LIGHT:
////                ThemeManager.setThemeFactory(new LightThemeFactory());
//////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
//////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
////                break;
////            case DEFAULT:
////                 ThemeManager.setThemeFactory(new DefaultThemeFactory());
//////                this.cbTheme.getScene().getRoot().getStylesheets().clear();
//////                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("Styles.css").toExternalForm());
////                break;
//        }
        ThemeManager.applyTheme(this.cbTheme.getScene());
                
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(Theme.values()));
    }
}
