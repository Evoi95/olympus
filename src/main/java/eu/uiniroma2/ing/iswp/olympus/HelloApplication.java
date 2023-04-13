package eu.uiniroma2.ing.iswp.olympus;

import eu.uiniroma2.ing.iswp.olympus.dao.StudenteDao;
import eu.uiniroma2.ing.iswp.olympus.ulities.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        try {
            ArrayList<String> col = new ArrayList<>();
            col.add("nome");
            col.add("cognome");
            col.add("email");
            CreateDefaultDB.createDefaultDB();
            StudenteDao.getStudenteData(1,col );
        } catch (FileNotFoundException | SQLException err) {
            err.printStackTrace();

        }
        launch();
    }
}