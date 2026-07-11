public class CreditCardPayment extends PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String accountHolder, double amount, String cardNumber) {
        super(accountHolder, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Charging card **** **** **** " + last4 + " ...");
        System.out.println("Credit card payment approved.");
    }

    @Override
    public double calculateFee() {
        return amount * 0.025; // 2.5% card processing fee
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}