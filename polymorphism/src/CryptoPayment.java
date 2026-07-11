public class CryptoPayment extends PaymentMethod {

    private String walletAddress;
    private String coinType;

    public CryptoPayment(String accountHolder, double amount, String walletAddress, String coinType) {
        super(accountHolder, amount);
        this.walletAddress = walletAddress;
        this.coinType = coinType;
    }

    @Override
    public void processPayment() {
        System.out.println("Broadcasting " + coinType + " transaction to " + walletAddress + " ...");
        System.out.println("Waiting for blockchain confirmation.");
    }

    @Override
    public double calculateFee() {
        return amount * 0.01; // 1% network fee
    }

    @Override
    public String getPaymentType() {
        return "Cryptocurrency";
    }
}