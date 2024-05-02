package ikalawa;

public class Student implements Type {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}
