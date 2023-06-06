package JavaBasics;

public class Bank {

    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 140000, 11);
        accountTwo = new CheckingAccount("Ares", 150000,12);
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();

        System.out.println(bankOfGods.accountOne);
        System.out.println(bankOfGods.accountTwo);
    }
}
