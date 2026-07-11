public abstract class PaymentMethod {

    protected String accountHolder;
    protected double amount;

    public PaymentMethod(String accountHolder, double amount) {
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    // Every subclass MUST supply its own way of moving the money.
    public abstract void processPayment();

    // Every subclass MUST supply its own fee calculation.
    public abstract double calculateFee();

    // Every subclass MUST report what kind of payment it is.
    public abstract String getPaymentType();

    // This method is written ONCE, here, against the PaymentMethod type,
    // and is never overridden (final). Yet at runtime it calls whichever
    // processPayment()/calculateFee() belongs to the REAL object
    // (CreditCardPayment, PayPalPayment, etc). Java resolves that call
    // based on the object's actual class, not this class. That automatic
    // "correct version wins" behavior is polymorphism.
    public final void printReceipt() {
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s: %s%n", "Payment type", getPaymentType());
        System.out.printf("%-15s: %s%n", "Account holder", accountHolder);
        System.out.printf("%-15s: $%.2f%n", "Amount", amount);
        System.out.printf("%-15s: $%.2f%n", "Processing fee", calculateFee());
        processPayment();
        System.out.println("-----------------------------------------");
    }
}