package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class twoWindows {
    Stage newStage = new Stage();
   // private static MyATM callFunc = new MyATM();

    public void depositWindow(Label balance) {
        //newStage.initModality(Modality.APPLICATION_MODAL);
        Label depLabel = new Label("Enter the amount to be deposited:");
        depLabel.setFont(Font.font(0b10111));
        TextField depAmount = new TextField();
        Button confirm = new Button("Confirm");
        GridPane showFunc = new GridPane();
        showFunc.add(depLabel, 2, 2);
        showFunc.add(depAmount, 3, 2);
        showFunc.add(confirm, 5, 4);
        Scene scene2 = new Scene(showFunc, 777, 250);
        newStage.setScene(scene2);
        newStage.show();
        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newWindow.callFunc.deposit(depAmount.getText());
               balance.setText(newWindow.callFunc.getCurrentBalance());
               newStage.close();
            }
        });


    }

    public void withdrawWindow(Label balance) {
        // newStage.initModality(Modality.APPLICATION_MODAL);
        Label withdrawLabel = new Label("Enter the amount you want to withdraw:");
        withdrawLabel.setFont(Font.font(0b10111));
        TextField withdrawAmount = new TextField();
        GridPane showFunc = new GridPane();
        showFunc.add(withdrawLabel, 2, 2);
        showFunc.add(withdrawAmount, 3, 2);
        Button done = new Button("Confirm");
        showFunc.add(done, 4, 4);
        String check= balance.getText();
        Label checkLabel=new Label("you don't have enough balance !");
        checkLabel.setFont(Font.font(0b10111));
        Scene scene2 = new Scene(showFunc, 777, 250);
        newStage.setScene(scene2);
        newStage.show();
        done.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(Integer.parseInt(check)<Integer.parseInt(withdrawAmount.getText())){
                    showFunc.add(checkLabel, 2, 6);
                }

                newWindow.callFunc.withdraw(withdrawAmount.getText());
                balance.setText(newWindow.callFunc.getCurrentBalance());
               // newStage.close();

            }
        });
        // return (int) Double.parseDouble(withdrawAmount.getText());

    }
}
