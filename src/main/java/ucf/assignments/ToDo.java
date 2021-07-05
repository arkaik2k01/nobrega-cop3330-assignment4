package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDo
{
    public static void main(String[] args)
    {
        launch();
    }

    public void start(Stage primaryStage)
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDo.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
