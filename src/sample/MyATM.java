package sample;

public class MyATM implements ATM {
    private Customer currentCustomer;
    private Transaction[] transactions = new Transaction[5];
    int counter = 0;
    int current = -1;
    //int prev = 0;
    //int next = -1;

    public MyATM() {

        currentCustomer = new Customer();

    }


    public void withdraw(String withdrawAmount) {
        int newBalance = this.currentCustomer.getBalance() - Integer.parseInt(withdrawAmount);
        //String newBalance = this.currentCustomer.getBalance()-withdrawAmount;
        Transaction x = new Transaction("Withdraw", withdrawAmount);
        if (counter >= 5) {
            transactions = shiftArray(transactions);
            counter = 4;
        }
        transactions[counter] = x;
        counter++;
        this.currentCustomer.setBalance(newBalance);

    }

    public void deposit(String depositAmount) {
        int newBalance = this.currentCustomer.getBalance() + Integer.parseInt(depositAmount);
        Transaction y = new Transaction("Deposit", depositAmount);
        if (counter >= 5) {
            transactions = shiftArray(transactions);
            counter = 4;
        }
        transactions[counter] = y;
        counter++;
        this.currentCustomer.setBalance(newBalance);
    }


    public String getCurrentBalance() {

        return Integer.toString(this.currentCustomer.getBalance());
    }

    public String next() {
        String resultNext = "";
        int next = current + 1;
        if(current==-1){
            return  resultNext;
        }
        if (next >=0) {
            resultNext = "Transaction type is :" + transactions[next].getType() + " and value is:" + transactions[next].getValue();
            current++;
        }
        return resultNext;
    }
    public String prev() {
        if (current == -1)
            current = counter - 1;
        //System.out.println(counter);
        //System.out.println(current);
        int prev= current - 1;
        //System.out.println(prev);
        String resultPrev = "";
        if (prev>= 0) {
            resultPrev = "Transaction type is :" + transactions[prev].getType() + " and value is:" + transactions[prev].getValue();
            current--;
        }
        return resultPrev;
    }

    public Transaction[] shiftArray(Transaction[] transactions) {
        for (int i = 0; i < 4; i++) {
            transactions[i] = transactions[i + 1];
        }
        return transactions;
    }


}


