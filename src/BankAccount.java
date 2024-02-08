public class BankAccount {
    int moneyAmount;
    int accountNumber;

    static int accounts;
    public BankAccount(int moneyAmount)
    {
        this.moneyAmount = moneyAmount;
        accounts++;
        accountNumber = accounts;

    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }

    public void deposit(int amount)
    {
        moneyAmount += amount;
    }

    public void withdraw(int amount)
    {
        moneyAmount -= amount;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public int getBalance()
    {
        return moneyAmount;
    }

    public static int getTotalAccounts()
    {
        return accounts;
    }

}