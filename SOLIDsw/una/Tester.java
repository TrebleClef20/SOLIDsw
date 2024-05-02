package una;

public class Tester {
    public static void main(String[] args) {
        Pet muning = new Pet("Muning", "Irwinn");

        SoundAction soundAction = new SoundAction();
        EatAction eatAction = new EatAction();

        soundAction.makeSound(muning, "meow");
        eatAction.eat(muning, "cat food");
    }
}
