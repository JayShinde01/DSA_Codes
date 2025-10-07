public class PrimeCheck {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPrime(num));
       
    }
    public static boolean isPrime(int a){
         if(a == 1 || a % 2 == 0)return false;
         else if(a == 2)return true;
         else{
            if ((a*a-1)% 24 == 0) {
                return true;
            }
         }

        return false;
    }
}
