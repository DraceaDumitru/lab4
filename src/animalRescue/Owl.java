package animalRescue;

public class Owl implements Animal {

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public String makeSound() {
        return "Boo Boo Boo";
    }

    @Override
    public boolean sleep() {
        return true;
    }

    @Override
    public String eat() {
        return "wild mouse ";
    }

    @Override
    public String color() {
        return "white";
    }

    public static boolean fly() {
        return true;
    }

    public static boolean activeAtNight() {
        return true;
    }
}
