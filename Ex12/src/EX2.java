import java.util.Scanner;

public class EX2 {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int SHIFT = 4;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please insert a string of characters : ");
        String s = scanner.nextLine();
        // the string to encode
        String toEncode = s.replaceAll("[^a-z ]", ""); // replace everything that is not between a-z
        // the coded string
        String chainCoded = getChainCode(toEncode);

        System.out.format("the initial chain was : '%s'\n", s);
        if (toEncode.isEmpty()) {
            System.out.println("the string to encode is empty.\n");
        } else {
            System.out.format("the string to encode is : '%s'\n", toEncode);
            System.out.format("the coded string is : '%s'\n", chainCoded);
        }
    }

    static String getChainCode(String chianCode) {

        return null;
    }
}
