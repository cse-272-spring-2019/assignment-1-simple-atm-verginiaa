package sample;

public class validatePassword {
    private String rightPassword;

    public boolean validate(String number) {
        rightPassword = "1234";
        boolean equality = number.equals(rightPassword);
        return equality;
    }
}
