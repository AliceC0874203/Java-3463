import java.util.Scanner;

public class Swap {
    /**
     * Exercise 3
     * Implement an algorithm in Java that allows you to swap the values of two variables.
     *  Execution example:
     * Enter x: 1
     * Enter y: 2
     * Before swapping:
     * After swapping:
     * */
    static void ex3() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = userInput.nextInt();

        System.out.print("Enter y: ");
        int y = userInput.nextInt();

        System.out.println("Before swapping: x: " + x + " y : " + y);

        int tempX = x;
        x = y;
        y = tempX;

        System.out.println("After swapping: x: " + x + " y : " + y);
    }

    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
//        ex4();
    }
}