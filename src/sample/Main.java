package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Banking loginAtm = new Banking();
        loginAtm.draw();
        primaryStage.setTitle("ATM_PROJECT");
        primaryStage.setScene(loginAtm.getScene());
        primaryStage.show();
    }
}