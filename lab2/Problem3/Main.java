package Problem3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1001, 5.0);
        CheckingAccount c1 = new CheckingAccount(2001);
        Account a1 = new Account(3001);

        s1.deposit(1000);
        c1.deposit(100);
        c1.withdraw(20);
        c1.deposit(50);
        c1.withdraw(10); // transactions > FREE_TRANSACTIONS
        a1.deposit(500);

        bank.openAccount(s1);
        bank.openAccount(c1);
        bank.openAccount(a1);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();

        bank.closeAccount(3001);

        System.out.println("\nAfter closing account 3001:");
        bank.printAccounts();
    }
}
