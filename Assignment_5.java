public class Assignment_5{
    public static void main(String[] args) {
        System.out.println("Assignment no - 5");
        System.out.println(isPerfect(27));
        
       
    }
    /**
     * Q1. Count Digits in a Number
        Given a number n, count how many digits it contains.
        Example:
        Input: n = 54321
        Output: 5
        Hint: 
        Use digit extraction.
     */
    public static int countDigits(int num){
        int digitCount=0;
        while( num != 0){
            num /= 10;
            digitCount++;
        }
        return digitCount;
    }
    /**
     * Q2. Extract All Digits
        Print all digits of a number from right to left.
        Example:
        Input: n = 5382
        Output:
        2
        8
        3
        5
     */
    public static void extractAllDigits(int num){
        while(num != 0){
            System.out.println(num % 10);
            num /= 10;
        }
    }
    /**
     * Q3. Reverse a Number
        Reverse the digits of a number.
        Example:
        Input: 12345
        Output: 54321
     */
    public static int reverseNumber(int num){
        int rev = 0;
        while(num != 0){
            rev = rev*10+num%10;
            num /= 10;
        }
        return rev;
    }
    /**
     * Q4. Palindrome Number
        Check if a number is a palindrome.
        A number is palindrome if it reads the same forward and backward.
        Example:
        Input: 121

     */
    public static boolean isPalindrom(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
            if(num == rev || num/10 == rev){
                return true;
            }
        }
        return  false;
    }
    /**
     * Q5. Sum of Digits
        Find the sum of digits of a number.
        Example:
        Input: 543
        Output: 12
        Because
        5 + 4 + 3 = 12
     */
    public static int digitSum(int num){
        int sum = 0 ;
        while(num != 0){
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }
    /**
     * Q6. Armstrong Number
        Check if a number is an Armstrong number.
        Definition:
        A number is Armstrong if
        sum of (digits^number_of_digits) = number
        Example:
        Input: 153
        1³ + 5³ + 3³
        = 1 + 125 + 27
        = 153
        Output:
        Armstrong Number
     */
    public static boolean  isArmstrong(int n){
        int temp = n;
        int digits=0;
        while(temp != 0){
            temp /= 10;
            digits++;
        }
        temp = n;
        int sum = 0;
        while(temp != 0){
            sum += (int)Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(n);
        System.out.println(sum);
        return n == sum;
    }
    /**
     * Q7. Print All Divisors
        Print all divisors of a number.
        Example:
        Input: n = 12
        Output:
        1 2 3 4 6 12

     */
    public static void printAllDivisors(int num){
        for(int i = 1 ; i <= num/2; i++){
            if(num % i == 0)
            System.out.print(" "+i);
        }
        System.out.print(" "+num);
    }
    /**
     * Q8. Count Number of Divisors
        Find how many divisors a number has.
        Example:
        Input: n = 12
        Divisors: 1 2 3 4 6 12
        Output: 6
     */
    public static int countAllDivisor(int num){
        int count =0;
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count+1;
    }
    /**
     * Q9. Check Prime Number
            Check if a number is prime or not.
            Definition:
            A number is prime if it has exactly two divisors
            1 and itself
            Example:
            Input: 7
            Output: Prime
     */
    public static boolean isPrime(int num){
        if(num == 2)return true;
        if(num == 1)return false;
        if(num % 2 == 0)return false;
        for(int i = 3; i * i <= num ; i++){
            if(num % i == 0)return false;
        }
        return true;
    }
    /**
     * Q10. Print All Prime Numbers up to N
        Print all prime numbers from 1 to n.
        Example:
        Input: n = 20
        Output:
        2 3 5 7 11 13 17 19
     */
    public static void printAllPrimeNumbers(int n){
        for(int i = 2 ; i <= n ;i++ ){
            if(isPrime(i)){
                System.out.print(" "+i);
            }
        }
    }
    /**
     * Q11. Find GCD / HCF of Two Numbers (Brute Force)
        Find the Greatest Common Divisor (GCD) of two numbers.
        Example:
        Input:
        a = 12
        b = 18
        Output:
        6
        Because
        Divisors of 12 = 1 2 3 4 6 12
        Divisors of 18 = 1 2 3 6 9 18
        Greatest common divisor = 6
     */
    public static int findGCD(int num1, int num2){
        int largest = Math.max(num1,num2);
      
        int gcd=1;
        for(int i = 1; i <= largest/2; i++){
            if(num1 % i == 0 && num2 % i == 0){
               int factor = i;
                gcd = Math.max(gcd,factor);
            }
        }
        return gcd;
    }
// using euclidean algorithm
    public static int Gcd1(int a, int b){
        if(b == 0){
            return a;
        }
        return Gcd1(b,a%b);
    }
    public static int GCD2(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            
        }
        return a;
    }
    /**
     * Q13. Check Coprime Numbers
        Two numbers are coprime if their GCD = 1.
        Example:
        Input:
        8 15
        Output:
        Coprime
        Because
        gcd(8,15) = 1

     */
    public static boolean isCoPrime(int a, int b){
        return Gcd1(a, b) == 1;
    }
    /**
     * Q14. Check Perfect Number
        A number is perfect if
        sum of its proper divisors = number
        Example:
        Input: 6
        Divisors: 1 2 3
        1 + 2 + 3 = 6
        Output:
        Perfect Number
     */
    public static boolean isPerfect(int num){
        int sum = 0 ;
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }
}