package ikaapat;

public class Cash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying Php" + amount + " via " + this.getClass());
    }
}
