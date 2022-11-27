import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a positive number total amount S0 : ");
        float s0 = userInput.nextFloat();

        System.out.print("Enter a positive number reimburses each month R : ");
        float r = userInput.nextFloat();

        System.out.print("Enter a number between 0-1 monthly interest rate IR : ");
        float ir = userInput.nextFloat();

        if (ir <= 0 || ir >= 1) {
            System.out.print("Invalid Interest Rate. Value should be between 0 and 1");
        } else {
            float s = s0;
            float i = 0;
            int monthCount = 0;
            while ( s > 0 ) {
                i = i + (ir * s);
                s = s - r;
                monthCount++;
            }

            System.out.printf("The sum of interest received (over %d months) is then %.0f dollars.", monthCount, i);

        }
    }
}
