import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Age {
    /**
     * Exercises:
     * Exercise 1
     * Write a program Age.java that Asks the user for age;
     * reads the user's answer and saves it in an integer age variable;
     * calculates the year of birth of the user and records it in the variable;
     * displays the year of birth as calculated;
     * execution example:
     * provide your age:
     * 19
     * Your year of birth is 1997
     * */
    static void ex1() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("provide your age:");

        int age = userInput.nextInt();
        System.out.print(calculateAge(age));
    }

    static String calculateAge(int userAge) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();

        int yearOfBirth = Integer.parseInt(formatter.format(date)) - userAge;

        return "Your year of birth is " + yearOfBirth;
    }

    public static void main(String[] args) {
        ex1();
//        ex2();
//        ex3();
//        ex4();
    }
}
