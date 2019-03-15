package sample;

public interface ATM {
    String getCurrentBalance();

    void withdraw(String withdrawAmount);

    void deposit(String depositAmount);

    String prev();

    String next();


}
