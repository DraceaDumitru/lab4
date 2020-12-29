package whileLoops;

public class Main {
    public static void main(String[] args) {
        LogicalOP logicalOP = new LogicalOP();
        int a = 80;
        System.out.print("count from 80 to 100 : ");
        logicalOP.count(a);
        System.out.println();

        System.out.println();
        int b = -80;
        System.out.print("count from -80 to -100 : ");
        logicalOP.countDown(b);
        System.out.println();

        System.out.println();
        int start = 20;
        int finish = 30;
        System.out.print("count between a b = ");
        logicalOP.countBetweenAb(a, b);
        System.out.println();

      /*  System.out.println();
        int x = 10;
        int y = 4;
        System.out.print("check who is bigger and count : ");
        logicalOP.checkAndCount(a, b);
        System.out.println();*/


        System.out.println();
        logicalOP.countEvenNumbers();
        System.out.println();

        System.out.println();
        logicalOP.countOddNumbers();
        System.out.println();

        System.out.println();
        System.out.print("Count and do average of numbers : ");
        logicalOP.countAndMakeAverageNumber();
        System.out.println();

        System.out.println();
        int e = 7;
        int g = 28;
        logicalOP.divisibleNumbers(e, g);
        System.out.println();

        System.out.println();
        logicalOP.displayFibonacciSeries();
        System.out.println();

        System.out.println();
        logicalOP.cozaLozaWoza();
        System.out.println();
    }


}
