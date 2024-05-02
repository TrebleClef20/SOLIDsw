package ikalawa;

public class Customer {

  private String name;
  private Type type; // "Student", "Senior Citizen", or "Regular"

  public Customer(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public double applyDiscount(double amount) {
    return amount - type.calculateDiscount(amount);
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  
}
