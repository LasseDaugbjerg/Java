import java.util.Scanner;

public class opgave3 {
    public static void main(String[] args) {
    isNumOddOrEven();
    }
    public static void isNumOddOrEven() {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Type in your number to check whether it is odd or even here: ");
        int number = inputNum.nextInt();

        boolean isOdd = number % 2 != 0;
        if (isOdd) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }
}
