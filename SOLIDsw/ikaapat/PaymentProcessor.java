package ikaapat;

public class PaymentProcessor {
  private PaymentMethod paymentMethod;

  public PaymentProcessor(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  void processPayment(Order order) {
    paymentMethod.pay(order.getAmount());
  }
}
