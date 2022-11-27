import java.util.Scanner;

public class ParachutingJump {
    public static void main(String[] args) {
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0; //time of fall

        Scanner keyboard = new Scanner(System.in);
        double mass = 80.0;
        do {
            System.out.print("mass of parachutist (>= 40) ? ");
            mass = keyboard.nextDouble();
        } while (mass < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("starting height of parachutist (>= 250) ? ");
            h0 = keyboard.nextDouble();
        } while (h0 < 250.0);

        double speed = v0;
        double height = h0; //altitude
        double accel = g;
        double t = t0; //current time

        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, height, speed, accel);

        double surface = 2.0;
        double s = surface/mass;
        double q = Math.exp(-s * (t - t0)); //term

//        speed = (g/s) * (1-q) + v0 * q;
//        height = h0 - (g/s) * (t-t0) - ((v0 - (g/s))/s) * (1 - q);
//        accel = g - s * speed;

        boolean isExceedSpeedPrint = false;
        boolean isMaxSpeedPrint = false;
        boolean isBelow2500Print = false;

        while (height > 0) {
            ++t;
            speed = (g/s) * (1-q) + v0 * q;
            height = h0 - (g/s) * (t-t0) - ((v0 - (g/s))/s) * (1 - q);
            accel = g - s * speed;
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, height, speed, accel);

            if (speed > 343 && isExceedSpeedPrint == false) {
                isExceedSpeedPrint = true;
                System.out.println("## Felix exceeds the speed of sound");
            }

            if (accel < 0.5 && isExceedSpeedPrint == false) {
                isExceedSpeedPrint = true;
                System.out.println("## Felix reached his maximum speed");
            }

//            if (height < 2500 && isBelow2500Print == false) {
//                surface = 25.0;
//                s = surface/mass;
//                isBelow2500Print = true;
//                System.out.println("## Felix opens his parachut");
//            }
        }
    }
}
