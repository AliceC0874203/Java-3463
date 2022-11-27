import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("a0 = ");
        int a0 = userInput.nextInt();

        System.out.println("a1 = ");
        int a1 = userInput.nextInt();

        System.out.println("a3 = ");
        int a2 = userInput.nextInt();

        double q = ((3 * a1) - (a2 * a2)) / 9.0;
        double r = ((9 * a2 * a1) - (27 * a0) - (2 * (a2 * a2 * a2))) / 54.0;
        double d = (q * q * q) + ( r * r );

        if (d < 0){
            double tTa = Math.acos(r/Math.sqrt(Math.pow(-q,3)));
            double z1 = (2 * Math.sqrt(-q)) * Math.cos(tTa/3) - (a2/3);
            double z2 = (2 * Math.sqrt((-q)) * Math.cos((tTa - (2*Math.PI))/3)) - (a2/3);
            double z3 = (2 * Math.sqrt((-q)) * Math.cos((tTa - (4*Math.PI))/3)) - (a2/3);
            System.out.printf("z1 = %.2f, z2 = %.2f, z3 = %.2f", z1 , z2 ,z3);
        } else {
            double cubicRoot = Math.pow(d,1.0/3.0);
            double s = Math.pow((r + Math.sqrt(d)), 1/3);
            double t = Math.pow((r - Math.sqrt(d)), 1/3);
            double z1;
            double z2;

            if ((d == 0) && ((s + t) != 0)) {
                z1 = (s+t) - (a2/3);
                z2 = (-(s+t)/2) - (a2/3);
                System.out.printf("z1 = %.2f, z2 = %.2f", z1 , z2);
            } else {
                z1 = s;
                System.out.printf("z1 = %.2f" , z1);
            }
        }
    }
}