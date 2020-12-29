package whileLoops;

import javax.sound.midi.Soundbank;

public class LogicalOP {
    // Ex 1
    public static void count(int start) {
        int a = 80;
        while (a < 100 + 1) {
            System.out.print(a);
            a++;
        }
    }

    // Ex 2
    public static void countDown(int start) {
        int b = -80;
        do {
            System.out.print(b);
            b--;
        }
        while (b > (-100 - 1));
    }

    // Ex 3
    public static void countBetweenAb(int start, int stop) {
        int a = 20;
        int b = 30;
        do {
            System.out.print(a);
            a++;
        }
        while (a < b + 1);
    }

    // Ex 4
    public static void checkAndCount(int start, int stop) {
        int a = 10;
        int b = 4;
        //Nu stiu sa il rezolv
    }

    // Ex 5
    public static void countEvenNumbers() {
        int number = 100;
        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }
    }

    // Ex 6
    public static void countOddNumbers() {
        int number = 100;
        System.out.print("List of odd numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {

                System.out.print(i + " ");
            }
        }
    }

    // Ex 7
    public static void countAndMakeAverageNumber() {
        int sum = 0;
        int number1 = 111;
        int number2 = 8899;
        double average = 0;
        while (sum == 0) {
            for (int i = number1; i <= number2; i++)
                sum = sum + i;
            for (int i = number1; i <= number2; i++)
                average = sum / i;
            System.out.println("The sum is " + sum + " and the average is " + average + ".");
        }
    }

    // Ex 8
    public static void divisibleNumbers(int first, int second) {
        int g = 28;
        int sum = 0;
        int count = 7;
        for (int e = 7; e <= g; e++) {
            if (e % 7 == 0) {
                sum += e;
                count++;
            }
        }
        System.out.println("the average is " + sum / count);

        System.out.println("the sum is " + sum);
    }

    // Ex 9
    public static void displayFibonacciSeries() {
        int i = 1, n = 20, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
    // Ex 10
    public static void cozaLozaWoza(){
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

}
