public class BankAccount {

    // Private fields = data hiding. Nothing outside this class can touch these directly.
    private final String accountNumber;   // no setter anywhere -> read-only after creation
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = (initialBalance > 0) ? initialBalance : 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter exists, but there is deliberately NO setBalance().
    public double getBalance() {
        return balance;
    }

    // The only two doors into changing balance — both guarded by rules.
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + " -> New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " -> New balance: " + balance);
        }
    }
}