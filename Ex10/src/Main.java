import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Construction of a new point Please enter x: ");
        double x1 = input.nextDouble();
        System.out.print("Please enter y: ");
        double y1 = input.nextDouble();

        System.out.print("Construction of a new point Please enter x: ");
        double x2 = input.nextDouble();
        System.out.print("Please enter y: ");
        double y2 = input.nextDouble();

        System.out.print("Construction of a new point Please enter x: ");
        double x3 = input.nextDouble();
        System.out.print("Please enter y: ");
        double y3 = input.nextDouble();

        Triangle triangle = new Triangle();
        triangle.setLine1(x1,y1);
        triangle.setLine2(x2,y2);
        triangle.setLine3(x3, y3);

        double distance1 = triangle.getLine1();
        double distance2 = triangle.getLine2();
        double distance3 = triangle.getLine3();

        if (distance1 == distance2) {
            System.out.println("Perimeter: " + (distance1 + distance2 + distance3));
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is not isosceles");
        }
    }
}