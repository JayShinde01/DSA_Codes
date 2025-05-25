import java.util.Scanner;

public class basicMaths {
    
  public static void main(String[]args){
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    int num1=2;
    int num2=11;
    System.out.println(isPrime(num1));
    // divisor(num1); 

  }
  //6. Check if a number is prime or not
  public static boolean isPrime(int num) {
    if (num == 2) {
      return true;
    }
  else  if (num == 1) {
      return false;
    }
    else if (num %2 == 0) {
      return false;
    }

    for (int i = 3; i <=num/2; i++) {
      if (num % i == 0) {
      return false;
    }
    }
    return true;

  }
  //5. Print all Divisors of a given Number
  public static void divisor(int num) {
    for (int i = 1; i <= num/2; i++) {
      if (num % i == 0) {
        System.out.println(i);
      }
    }
        System.out.println(num);

  }
  // 4. Check if a number is Armstrong Number or not
  public static boolean Armstrong(int num) {
    int digits = count_digits( num);
    int sum = 0,temp=num;
    while (num != 0) {
      int rem = num%10;
      sum += Math.pow(rem, digits);
      num/=10;
    }
    if (temp == sum) {
      return true;
    }
    return false;

  }
  //3. Find GCD of two numbers
 public static int gcd(int n1, int n2) {
    while (n1>0 && n2>0) {
        if(n1>n2){
            n1=n1%n2;
        }else{
            n2=n2%n1;
        }
    }
    
    
    if (n1 == 0)
        return n2;
    else
        return n1;
}

  //2. Check if a number is Palindrome or Not
public static int palindrome(int num){
    int temp=num;
    int rev=0;
    while(num!=0){
      rev=rev*10+num%10;
      num=num/10;
    }
    if(rev == temp){
        System.out.println("No. is Palindrome");
    }
    else{
        System.out.println("No. is not Palindrome");

    }
    return rev;
  }

  //1. Count digits in a number
  public static int count_digits(int num){
    int count_=0;
    while(num!=0){
      num /=10; 
      count_++;
    }
    return count_;
  }
}
