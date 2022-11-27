import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        String original;
        String reverse = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        original = input.nextLine();

        int length = original.length();
        for (int i = (length - 1); i >= 0; --i) {
            reverse = reverse + original.charAt(i);
        }

        if (original.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It isn't a palindrome!");
        }
    }
}
