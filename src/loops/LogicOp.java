package loops;

public class LogicOp {
    // Ex 1
    public static void count(int start) {
        for (int i = start; i <= 100; i++) {
            System.out.print(i);
        }
    }

    // Ex 2
    public static void invertCount(int start) {
        for (int i = start; i >= (-100); i--) {
            System.out.print(i);
        }
    }

    // Ex 3
    public static void countInInterval(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            System.out.print(i);
        }
    }

    // Ex 4
    public static void countFromLowNrToHighNr(int start, int finish) {
        if (start < finish) {
            for (int i = 10; i < finish; i++)
                System.out.print(start++);
        } else {
            System.out.println(finish++);
        }
    }

    // Ex 5
    public static void evenNumbers() {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.print(i);
        }

    }

    // Ex 6
    public static void oddNumbers() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.print(i);
        }
    }

    // Ex 7
    public static void sumOfAllNr(int num) {
        for (int i = num; i <= num; i = i + i) {
            System.out.print(i + 70 + 80 + 90 + 100);
        }
    }

    // Ex 8
    public static void averageNumbers(int num) {
        for (int i = num; i <= num; i = i + i) {
            System.out.print((i + 70 + 80 + 90 + 100) / 5);
        }
    }
        // Ex 9

        public static void stars () {
            for (int row = 1; row <= 6; row++) {
                for (int col = 1; col <= 7 - row; col++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }

    }


