import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Every element below has a DIFFERENT real class, but they are all
        // stored using ONE common type: PaymentMethod. That single fact is
        // what makes the loop below polymorphic.
        List<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCardPayment("Manilka", 250.00, "4111222233334444"));
        payments.add(new PayPalPayment("Manilka", 80.50, "manilka@example.com"));
        payments.add(new BankTransferPayment("Manilka", 1200.00, "Commercial Bank", "8890011223"));
        payments.add(new CryptoPayment("Manilka", 500.00, "bc1qxampleaddr9z8y7x", "Bitcoin"));

        System.out.println("===== PayFlow Payment Run =====\n");

        // SAME method call on every iteration: payment.printReceipt()
        // FOUR different outcomes. Java decides which processPayment()
        // and calculateFee() to run at RUNTIME, based on the object's
        // real class -- not the "PaymentMethod" type of the variable.
        // This is runtime polymorphism (dynamic method dispatch).
        for (PaymentMethod payment : payments) {
            payment.printReceipt();
            System.out.println();
        }

        double totalFees = 0;
        for (PaymentMethod payment : payments) {
            totalFees += payment.calculateFee();
        }
        System.out.printf("Total fees collected across %d payments: $%.2f%n", payments.size(), totalFees);
    }
}