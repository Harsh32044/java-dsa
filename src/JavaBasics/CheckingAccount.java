package JavaBasics;

public class CheckingAccount {

    private int balance;
    private String name;
    private int id;
    private double interestRate;
    public CheckingAccount(String name, int bal, int inputId) {
        this.name = name;
        this.balance =  bal;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int newBal) {
        this.balance =  newBal;
    }

    private double calculateNextMonthInterest() {
        return this.balance * this.interestRate;
    }

    public void getAccountInformation(){
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
        //Accessing a private method from within a public method - possible
    }

    /*When writing classes, we often make all of our instance variables private. However, we still might want some other
    classes to have access to them, we just don’t want those classes to know the exact variable name.
    To give other classes access to a private instance variable, we would write an accessor method*/
}
