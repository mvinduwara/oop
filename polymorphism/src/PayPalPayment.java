public class PayPalPayment extends PaymentMethod {

    private String email;

    public PayPalPayment(String accountHolder, double amount, String email) {
        super(accountHolder, amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Redirecting " + email + " to PayPal checkout ...");
        System.out.println("PayPal payment completed.");
    }

    @Override
    public double calculateFee() {
        return amount * 0.034 + 0.30; // 3.4% + $0.30 fixed fee
    }

    @Override
    public String getPaymentType() {
        return "PayPal";
    }
}