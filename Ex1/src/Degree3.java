import java.util.Scanner;

public class Degree3 {
    /**
     * Exercise 2
     * Write a small Java program, Degree3.java, allowing you to evaluate a 3rd degree polynomial
     * of the form:
     * ((a+b)/2)x^3 + (a+b)^2x^2 + a + b + c
     * Execution example:
     * Enter a (int) : 1
     * Enter b (int) : 2
     * Enter c (int) : 3
     * Enter x (double) : 3.5
     * The value of polynomial is 180.5625
     * Note that there is no single operator for Power 3 in Java.
     * It is necessary to use multiplications.
     * You will also introduce auxiliary variables as needed to make
     * the calculation more efficient. Do not forget to make sure that
     * the class name is the same as the file name
     * */
    static void ex2() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a (int) : ");
        int a = userInput.nextInt();

        System.out.print("Enter b (int) : ");
        int b = userInput.nextInt();

        System.out.print("Enter c (int) : ");
        int c = userInput.nextInt();

        System.out.print("Enter x (double) : ");
        double x = userInput.nextDouble();

        System.out.print(polynomialCalculate(a, b, c, x));
    }

    static String polynomialCalculate(int a, int b, int c, double x) {
        double result = (((a+b)/2) * (x*x*x)) + (((a+b)*(a+b)) * (x*x)) + a + b + c;
        return "The value of polynomial is " + result;
    }

    public static void main(String[] args) {
//        ex1();
        ex2();
//        ex3();
//        ex4();
    }
}
