import java.util.Scanner;

public class PlayWithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input number: ");
        int i = input.nextInt();

        int countLoop = 0;
        while (i > 0) {
            if (i % 3 == 0) {
                //+4
                i += 4;
            } else if ( i % 4 == 0) {
                //i/2
                i /= 2;
            } else {
                //-1
                i -= 1;
            }

            System.out.println(++countLoop + " -> " + i);
        }
    }
}