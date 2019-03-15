package view;

//import controller.MyATM;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class MainMenu extends GridPane {

    private Button withdraw;
    private TextField textField;
    private Button deposit;
    //  private MyATM atm;

    public MainMenu() {

        initialize();
        setActions();
    }

    public void initialize() {
        initializeButtons();

    }
    // public void initializeAtm(){
    //   atm = new MyATM();
    //}

    public void initializeButtons() {
        withdraw = new Button();

        deposit = new Button();

        withdraw.setPrefSize(50, 50);
        deposit.setPrefSize(20, 20);

        withdraw.setText("withdraw");
        deposit.setText("deposit");

        this.add(withdraw, 0, 0);
        this.add(deposit, 1, 1);


        // this.getChildren().addAll(withdraw,deposit);

    }

    public void setActions() {
        setWithdrawAction();
        setDepositAction();

    }

    public void setWithdrawAction() {
        withdraw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                doWithdraw();

            }
        });


    }

    public void doWithdraw() {

    }

    public void setDepositAction() {

    }


}
