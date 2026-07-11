public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC-1001", "Manilka", 1000.0);

        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\n--- Valid operations ---");
        account.deposit(500);
        account.withdraw(200);

        System.out.println("\n--- Invalid operations (validation kicks in) ---");
        account.deposit(-100);
        account.withdraw(999999);

        // account.balance = 999999;
        // Uncomment the line above -> it will NOT compile.
        // 'balance' is private, so this rule is enforced by the compiler, not just convention.

        System.out.println("\nFinal balance: " + account.getBalance());
    }
}