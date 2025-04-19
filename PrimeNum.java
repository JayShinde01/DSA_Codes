import java.util.*;

public class PrimeNum {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
         if (num % 2 == 0) return false;
    
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
