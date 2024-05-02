package ikaapat;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying Php" + amount + " via " + this.getClass());
    }
}
