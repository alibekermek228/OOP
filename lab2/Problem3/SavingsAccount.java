package Problem3;

public class SavingsAccount extends Account {
    private double interestRate; // in %

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount { account number: " + getAccountNumber() +
                ", balance: " + getBalance() +
                ", interest rate: " + interestRate + "% }";
    }
}
