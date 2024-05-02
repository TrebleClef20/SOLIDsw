package ikaapat;

public class Tester {

    public static void main(String[] args) {
        Order newOrder = new Order(1000);

        PaymentProcessor paymentProcessor = new PaymentProcessor(new EWallet());

        paymentProcessor.processPayment(newOrder);
    }
}
