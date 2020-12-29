package loops;

public class Main {
    public static void main(String[] args) {
        LogicOp logicOp = new LogicOp();
        int x = 0;
        System.out.print("count to 100 = ");
        logicOp.count(x);
        System.out.println();
        System.out.println();
        int y = 0;
        System.out.print("count to -100 = ");
        logicOp.invertCount(y);
        System.out.println();
        int start = 0;
        int finish = 18;
        System.out.println();
        System.out.print("count in interval = ");
        logicOp.countInInterval(start , finish);
        System.out.println();
        int low = 30 ;
        int high = 40 ;
        System.out.println();
        System.out.print("count from lower to higher = ");
        logicOp.countFromLowNrToHighNr(low,high+ 1);
        System.out.println();
        System.out.println();
        System.out.print("count even numbers = ");
        logicOp.evenNumbers();
        System.out.println();
        System.out.println();
        System.out.print("count odd numbers = ");
        logicOp.oddNumbers();
        System.out.println();
        System.out.println();
        int num =60 ;
        int stop =100;
        System.out.print("sum of all numbers = ");
        logicOp.sumOfAllNr(num);
        System.out.println();
        System.out.println();
        System.out.print("average numbers = ");
        logicOp.averageNumbers(num);
        System.out.println();
        System.out.println();
        logicOp.stars();
        System.out.println();
    }
}
