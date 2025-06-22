/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quizapp;

import com.mycompany.pojo.Category;
import com.mycompany.service.CategoryServices;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    
    private static final CategoryServices cateService = new CategoryServices();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "123456");
//            
//            Statement stm = con.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM category");
//            
//            List<Category> cates = new ArrayList<>();
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                
//                Category c = new Category(rs.getInt("id"), rs.getString("name"));
//                cates.add(c);
// 
//            }
//            con.close();
            
            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
    }    
    
}
