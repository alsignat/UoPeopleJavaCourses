package CS1102.unit2;

public class CheckPrime {
    public static boolean isPrime (int num) {
        boolean isPrime = num > 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
