package ikalawa;

public class SeniorCitizen implements Type {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
