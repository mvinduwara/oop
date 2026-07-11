public class BankTransferPayment extends PaymentMethod {

    private String bankName;
    private String accountNumber;

    public BankTransferPayment(String accountHolder, double amount, String bankName, String accountNumber) {
        super(accountHolder, amount);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Initiating transfer via " + bankName + " (acct " + accountNumber + ") ...");
        System.out.println("Funds arrive in 1-3 business days.");
    }

    @Override
    public double calculateFee() {
        return 1.50; // flat processing fee
    }

    @Override
    public String getPaymentType() {
        return "Bank Transfer";
    }
}