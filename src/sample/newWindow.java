package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class newWindow {
    Button withdrawButton = new Button("\nWithdraw");
    Button depositButton = new Button("\nDeposit");
    Button balanceButton = new Button("\nBalance Inquiry");
    Button previousButton = new Button("\nPrevious");
    Button nextButton = new Button("\nNext");
    Label balance = new Label("0");
    Label balanceShow = new Label("");
    Label transaction = new Label("");
    Stage newStage = new Stage();
    twoWindows window = new twoWindows();
      static  MyATM callFunc = new MyATM();



    public void FillWindow() {
        newStage.initModality(Modality.APPLICATION_MODAL);
        Label options = new Label("Your options:");
        Label history = new Label("        for your history navigation:");
        transaction.setPrefSize(250,30);
        options.setFont(Font.font(0b10111));
        //history.setFont(Font.font(0b10111));
        GridPane showFunc = new GridPane();
        showFunc.add(options, 0, 0);
        showFunc.add(history, 2, 0);
        showFunc.add(withdrawButton, 0, 2);
        showFunc.add(depositButton, 0, 5);
        showFunc.add(balanceButton, 0, 8);
        showFunc.add(previousButton, 3, 2);
        showFunc.add(nextButton, 3, 5);
        //showFunc.add(balance, 2, 6);
        showFunc.add(balanceShow, 2, 6);
        showFunc.add(transaction,1,10);
        Scene scene2 = new Scene(showFunc, 777, 450);
        newStage.setScene(scene2);
        newStage.show();
        depositButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.depositWindow(balance);
                //balance.setText(callFunc.getCurrentBalance());
            }
        });
        withdrawButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.withdrawWindow(balance);
                //balance.setText(callFunc.getCurrentBalance());
            }
        });
        balanceButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showFunc.add(balance, 1, 8);
               // callFunc.balanceInquiry();
                //balanceShow.setText(callFunc.balanceInquiry());
            }
        });
        previousButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                transaction.setText(callFunc.prev());
            }
        });
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                transaction.setText(callFunc.next());
            }
        });

    }//class


  /*  public void withdrawOption(){
        depositButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               window.withdrawWindow();
                runFunc.doDeposit();
            }
        });
    }
    public void BalanceOption(){
        balanceButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                runFunc.doBalanceInquiry();
            }
        });
    }
    public void PreviousOption(){
        previousButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                runFunc.doPrevious();
            }
        });
    }
    public void NextOption(){
            nextButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    runFunc.doNext();
                }
            });

        }*/


}
