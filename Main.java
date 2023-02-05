import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Metode 1
        int age;
        Scanner votingAge = new Scanner(System.in);

        System.out.println("Enter your age here to see if you can vote: ");
        int inputAge = votingAge.nextInt();


        if (inputAge > 18) {
            System.out.println("You can vote my friend");
        } else {
            System.out.println("You are too young to vote");
        }
    }

    }
