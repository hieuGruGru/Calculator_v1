package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Cal cu la tor");
        primaryStage.getIcons().add(new Image("C:\\Users\\phuon\\OneDrive\\Pictures\\Emoji\\teemo.jpg"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
