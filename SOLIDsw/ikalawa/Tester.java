package ikalawa;

public class Tester {
    public static void main(String[] args) {

        Customer regular = new Customer("Tambay", new Regular());
        Customer studyante = new Customer("Calma", new Student());
        Customer lolo = new Customer("lolo Treb", new SeniorCitizen());

        System.out.println("Bus Fares (sample amount: 100):");
        System.out.println(regular.getName() + " will pay base fee: " + regular.applyDiscount(100));
        System.out.println(studyante.getName() + " will pay base fee: " + studyante.applyDiscount(100));
        System.out.println(lolo.getName() + " will pay base fee: " + lolo.applyDiscount(100));
    }
}
