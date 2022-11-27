import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num1 = userInput.nextInt();

        System.out.print("Enter a positive number : ");
        int num2 = userInput.nextInt();

        int tmp1 = num1;
        int tmp2 = num2;

        while ( tmp1 != tmp2 ) {
            if ( tmp1 > tmp2 ){
                tmp1 = tmp1 - tmp2;
            } else {
                int tmp = tmp1;
                tmp1 = tmp2;
                tmp2 = tmp;
            }
        }
        System.out.print("The largest common divider of " + num1 + " and " + num2 + " is " + tmp1);
    }
}
