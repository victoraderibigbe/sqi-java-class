class Bank {
    String accountNumber;
    String accountName;
    double balance;

    Bank(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 500.25;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("kindly deposit a positive amount greater than 0!");
            return;
        }

        balance += amount;
        System.out.println("$" + amount + " has been deposited successfully and your new balance is $" + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("9032317059", "Victor Aderibigbe");
        bank.deposit(100);
    }
}
