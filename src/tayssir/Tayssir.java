/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayssir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author baz info
 */
public class Tayssir extends Application {
    
    @Override
    public void start(Stage stage)  throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/views/sample.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        System.err.println("hy");
        stage.show();
        
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}