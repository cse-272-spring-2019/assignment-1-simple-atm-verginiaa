package sample;

public class Customer {

    private int balance;

    //private String cardNr;

    public Customer() {
        //  this.cardNr = cardNr;

        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        // int balanceCheck = Integer.parseInt(balance);
        if (balance >= 0)
            this.balance = balance;

    }

    // public String getCardNr() {
    //   return cardNr;
    //}

    //public void setCardNr(String cardNr) {
    //this.cardNr = cardNr;
    //}


}
