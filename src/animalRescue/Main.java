package animalRescue;

public class Main {
    public static void main(String[] args) {
        Animal animalOWl = new Owl();
        Owl owl = new Owl();
        System.out.println("Owl");
        System.out.println("make sound : " + animalOWl.makeSound());
        System.out.println("walk : " + animalOWl.walk());
        System.out.println("sleep in tree : " + animalOWl.sleep());
        System.out.println("food : " + animalOWl.eat());
        System.out.println("active at night : " + Owl.activeAtNight());
        System.out.println("fly : " + Owl.fly());
        System.out.println("color : " + animalOWl.color());
        System.out.println();

        Animal animalSwan = new Swan();
        Swan swan = new Swan();
        System.out.println("Swan");
        System.out.println("make sound " + animalSwan.makeSound());
        System.out.println("walk : " + animalSwan.walk());
        System.out.println("sleep on the water :" + animalSwan.sleep());
        System.out.println("food : " + animalSwan.eat());
        System.out.println("fly :" + Swan.fly());
        System.out.println("swim : " + Swan.swim());
        System.out.println("color : " + animalSwan.color());
        System.out.println();

        Animal animalCougar = new Cougar();
        Cougar cougar = new Cougar();
        System.out.println("Cougar");
        System.out.println("make sound " + animalCougar.makeSound());
        System.out.println("walk : " + animalCougar.walk());
        System.out.println("sleep " + animalCougar.sleep());
        System.out.println("food : " + animalCougar.eat());
        System.out.println("climb in trees : " + Cougar.climb());
        System.out.println("run fast : " + Cougar.runFast());
        System.out.println("color : " + animalCougar.color());
        System.out.println();

        Animal animalOtter = new Otter();
        Otter otter = new Otter();
        System.out.println("Otter");
        System.out.println("make sound " + animalOtter.makeSound());
        System.out.println("walk : " + animalOtter.walk());
        System.out.println("sleep on the water : " + animalOtter.sleep());
        System.out.println("food : " + animalOtter.eat());
        System.out.println("swim :" + Otter.swim());
        System.out.println("color : " + animalOtter.color());
        System.out.println();

    }
}
