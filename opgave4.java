import java.util.Scanner;

public class opgave4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name here: ");
        String fullName = sc.nextLine();
        sc.close();

        String[] nameParts = fullName.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nameParts.length; i++) {
            String namePart = nameParts[i];
            if (i == nameParts.length - 1) {
                sb.append(namePart);
            } else {
                sb.append(namePart.charAt(0)).append(".");
            }
        }
        System.out.println("Here is you name shortend: " + sb.toString());
    }
}

