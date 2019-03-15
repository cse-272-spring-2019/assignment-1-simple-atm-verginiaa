package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Banking {
    validatePassword trial;
    newWindow open = new newWindow();
    Scene scene;

    // functions showf=new functions();
    public void draw() {
        trial = new validatePassword();
        Label welcome = new Label("WELCOME TO ATM");
        Label labelLogin = new Label("Pass Number");
        Button login = new Button("Log in");
        PasswordField passwordField = new PasswordField();
        Label result = new Label();
        GridPane grid = new GridPane();
        welcome.setFont(Font.font(0b10111));
        grid.add(welcome, 0, 0);
        grid.add(labelLogin, 0, 1);
        grid.add(login, 1, 2);
        grid.add(passwordField, 1, 1);
        grid.add(result, 1, 3);
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String password = passwordField.getText();
                boolean valid = trial.validate(password);
                if (valid) {
                    open.FillWindow();
                    //showf.drawFunc();
                    result.setText("right password");


                } else {
                    Label errorMode = new Label("Error wrong number !");
                    errorMode.setFont(Font.font(0b10111));
                    GridPane showError = new GridPane();
                    Stage errorStage = new Stage();
                    showError.add(errorMode, 3, 4);
                    Scene errorScene = new Scene(showError, 300, 200);
                    errorStage.setScene(errorScene);
                    errorStage.show();

                    result.setText("wrong password");
                }
            }
        });
        scene = new Scene(grid, 500, 200);
    }

    public Scene getScene() {
        return this.scene;
    }


}

