public class questions100 {
    public static void main(String[] args) {
int num=7;int fact=1;
      System.out.println(isPrime1(num,3));
    }
    // 5. Prime number check
    public static boolean isprime(int num) {
        if (num == 1) {
            return false;
        }
        else if (num == 2) {
            return true;
        }
        else if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
 public static boolean isPrime1(int num,int i) {
    if (Math.sqrt(num) == i) {
        return true;
    }
        if (num == 1) {
            return false;
        }
        else if (num == 2) {
            return true;
        }
        else if (num % 2 == 0) {
            return false;
        }
        if (num % i == 0) {
            return false;
        }

        return isPrime1(num,i+1);
    }
    // 4. Factorial of a number (iterative and recursive)
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *=i;
        }
        return fact;
    }
    
    public static int Factorial1(int num,int fact) {
        if (num == 0 || num ==1) {
            return fact;
        }
        return num*Factorial1( num-1, fact);
    }
    //2. Check for palindrome (string and number)
     public static boolean isPalindrome(String str) {
        String rev = reverseString(str);
      
        if (rev.equals(str)) {
            return true;
        }
        else{
            return false;
        }
    }
    //1. Reverse a string
    public static String reverseString(String str) {
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+str.charAt(i);
        }
        return rev;
    }
    public static void reverseString2(String str) {
        StringBuffer sb = new StringBuffer(str);
        
           sb.reverse();
        System.out.println(sb);
    }
     public static void reverseString3(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
          
        System.out.println(sb);
    }
    
}
