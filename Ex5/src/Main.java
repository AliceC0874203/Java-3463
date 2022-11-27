import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Give the start time of the rental (an integer): ");
        int startTime = userInput.nextInt();

        System.out.print("Give the end time of the rental (an integer): ");
        int endTime = userInput.nextInt();

        if (startTime < 0 || startTime > 24 || endTime < 0 || endTime > 24) {
            System.out.print("The hours must be between 0 and 24!");
        } else if (startTime == endTime) {
            System.out.print("Bizarre, you have not rented your bike for a long time!");
        } else  if (startTime > endTime) {
            System.out.print("Bizarre, the beginning of the rental is after the end ...");
        } else {
            int total = 0;
            int totalTime = endTime - startTime;
            int timeInADollarRate = 0;
            int timeInAtwoDollarRate = 0;

            for (int i = 0; i <= totalTime; i++) {
                int temp = startTime + i;
                if (temp < endTime) {
                    if (temp >= 0 && temp < 7 || temp >= 17 && temp < 24) {
                        //1$/hr
                        timeInADollarRate++;
                    } else {
                        //2$/hr
                        timeInAtwoDollarRate++;
                    }
                }
            }

            total = timeInADollarRate + (timeInAtwoDollarRate * 2);
            System.out.println("You rented your bike during \n " +
                    timeInADollarRate + " hour (s) at the hourly rate of 1.0 dollar (s)");
            if (timeInAtwoDollarRate > 0) {
                System.out.println("You rented your bike during \n " +
                         timeInAtwoDollarRate + " hour (s) at the hourly rate of 2.0 dollar (s)");
            }
            System.out.printf("The total amount payable is %d dollar (s)", total);
        }
    }
}