public class interviewCode{
    public static void main(String[]args){
        System.out.println("jay");
        System.out.println(nonRepeating("jja"));
        removeDuplicates("jay");
    }
    public static char nonRepeating(String str){
        for(int i = 0; i < str.length(); i++){
                char ch1 = str.charAt(i);
                int count =0 ;
            for(int j = 0 ; j< str.length(); j++){
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    count++;
                }
            }
            if(count == 1){
                return ch1;
            }
            
        }
        return '1';
    }

    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(sb.toString().indexOf(ch) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void count(String str){
        int vowel = 0;
        int consonant = 0;
        String s = str.toLowerCase();
        for(int i = 0 ; i < str.length(); i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("vowel: "+vowel);
        System.out.println("consonantr: "+consonant);
    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if( ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            sb.insert(0,ch);
        }
        return sb.toString();
    }
    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(n != 0){
            rev = rev*10 + n %10;
            n = n/10;
        }
        return rev == temp;
    }
    public static int reversenumber(int n){
        int rev = 0 ;
        int temp = n ;
        while(n != 0){
            rev = rev*10 + n%10;
            n = n /10;
        }
        return rev;
    }
    public static int fibonacci1(int n){
        if( n == 0 || n == 1){
            return n;
        }
        return fibonacci1(n-1)+fibonacci1(n-2);
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int i = 1; i <= n-1; i++){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c; 
            
        }
    }
    public static boolean isPrime(int n){
        if(n < 2)return false;
        if(n == 2)return true;
        if(n % 2 == 0)return false;
        for(int i = 3 ; i*i<= n; i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int factorial1(int n){
        int fact=1;
        for(int i=1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}