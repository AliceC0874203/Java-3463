import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a real number : ");
        double number = userInput.nextDouble();

        if ((number >= 2 && number < 3) || (number > 0 && number <= 1) || (number >= -10 && number <= -2)) {
            System.out.println("x belongs to I");
        } else {
            System.out.println("x doesn't belongs to I");
        }

        //test
//        double[] myNum = {-20, -10, -2, -1, 0, 1, 1.5, 2, 3, 4};
//
//        for (double number : myNum) {
//            if ((number >= 2 && number < 3) || (number > 0 && number <= 1) || (number >= -10 && number <= -2)) {
//                System.out.println("x belongs to I");
//            } else {
//                System.out.println("x doesn't belongs to I");
//            }
//        }
    }
}
