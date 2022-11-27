public class Prime {
    public static boolean isPrime(int number) {
        for(int check = 2; check < number; ++check) {
            if(number % check == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i <= 100; ++i) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}