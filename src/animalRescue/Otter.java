package animalRescue;

public class Otter implements Animal {

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public String makeSound() {
        return "phhaaa phaa piiiiuuaah ";
    }

    @Override
    public boolean sleep() {
        return true;
    }

    @Override
    public String eat() {
        return "fish , shells";
    }

    @Override
    public String color() {
        return "dark gray";
    }

    public static boolean swim() {
        return true;
    }
}
