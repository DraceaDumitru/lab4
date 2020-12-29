package animalRescue;

public class Cougar implements Animal {
    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public String makeSound() {
        return "oah grgrgr oah grgr";
    }

    @Override
    public boolean sleep() {
        return true;
    }

    @Override
    public String eat() {
        return "beef , pork , wild animals , chicken ";
    }

    @Override
    public String color() {
        return "light brown";
    }


    public static boolean climb() {
        return true;
    }

    public static boolean runFast() {
        return true;
    }
}
