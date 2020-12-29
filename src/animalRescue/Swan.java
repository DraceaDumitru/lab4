package animalRescue;

public class Swan implements Animal {
    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public String makeSound() {
        return "Peeon hoo Peeon hoo";
    }

    @Override
    public boolean sleep() {
        return true;
    }

    @Override
    public String eat() {
        return "small fish";
    }

    @Override
    public String color() {
        return "white";
    }


    public static boolean fly() {
        return true;
    }

    public static boolean swim() {
        return true;
    }
}
