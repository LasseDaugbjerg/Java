import java.util.Scanner;

public class opgave2 {
    public static void main(String[] args) {
        findMaxNum();
        findMinNum();
    }

    public static void findMaxNum() {
        int maxNum1 = 1;
        int maxNum2 = 18;
        int maxNum3 = 8;
        if (maxNum1 >= maxNum2 && maxNum1 >= maxNum3) {
            System.out.println(maxNum1 + " is the max number");
        } else if (maxNum2 >= maxNum1 && maxNum2 >= maxNum3) {
            System.out.println(maxNum2 + " is the max number");
        } else {
            System.out.println(maxNum3 + "is the max number");
        }
    }

    public static void findMinNum() {
        int minNum1 = 1;
        int minNum2 = 18;
        int minNum3 = -8;
        if (minNum1 <= minNum2 && minNum1 <= minNum3) {
            System.out.println(minNum1 + " is the min number");
        } else if (minNum2 <= minNum1 && minNum2 <= minNum3) {
            System.out.println(minNum2 + " is the min number");
        } else {
            System.out.println(minNum3 + " is the min number");
        }
    }
}

