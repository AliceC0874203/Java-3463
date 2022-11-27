import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        double number = userInput.nextDouble();

        if (number > 0) {
            if (number % 2 == 0) { //even
                System.out.printf("The number is positive and even");
            } else { //odd
                System.out.printf("The number is positive and odd");
            }
        } else {
            if (number % 2 == 0) { //even
                System.out.printf("The number is negative and even");
            } else { //odd
                System.out.printf("The number is negative and odd");
            }
        }

    }
}