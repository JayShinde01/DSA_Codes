public class recursion {
    public static void main(String[] args) {
        // int arr [] ={1,2,3,7,7,6,8};
        int num1 = 2;int target=7;int last=0;
        int num2=11;
       System.out.println(gcd(num1,num2));
    }
    // 14. Print all numbers from 1 to N divisible by 3
    
    //13. Find GCD (HCF) of two numbers using recursion
     public static int gcd(int n1, int n2) {
        if (n1==0 && n2==0) {
            if (n1 == 0)
                return n2;
            else
                return n1;
        }
   
        if(n1>n2){
            n1=n1%n2;
        }else{
            n2=n2%n1;
        }
    
    return gcd(n1, n2);
    
    
}
    //12. Check if a number is a palindrome
    public static boolean palindrome(int num) {
       int rev= rev_no(num,0);
      
       if (rev == num) {
        return true;
       }else{
        return false;
       }
    }
    // 11. Count how many times a digit appears in a number
     public static int occurence(int num ,int target, int count){
            if(num == 0){
                return count;
            }
             if (num%10 == target) {
                count++;
             } 
             
            return occurence(num/10, target,count);
          }
    //10. Reverse a number using recursion
        public static int rev_no(int num , int rev){
            if(num == 0){
                return rev;
            }
             rev = rev *10 + num%10;
             
            return rev_no(num/10, rev);
          }
// 9. Find the last index of an element in an array
 public static int last_index(int arr[],int index,int target,int last) {
        if (index == arr.length) {
           return last;


        }
        if (arr[index] == target ) {
            last =index;
        }
       
       
        
        return  last_index(arr,index+1,target,last);
    }

    // 8. Find the first index of an element in an array
     public static int first_index(int arr[],int index,int target) {
        if (index == arr.length-1) {
            return -1;
        }
        if (arr[index] == target ) {
            return index;
        }
       
       
        
        return  first_index(arr,index+1,target);
    }
    //7. Check if a number is prime
     public static boolean isPrime(int num,int i) {
        if (i == num /2) {
            return true;
        }
    if (num == 2) {
      return true;
    }
  else  if (num == 1) {
      return false;
    }
    else if (num %2 == 0) {
      return false;
    }
      if (num % i == 0) {
      return false;
    
    }
    return isPrime( num,i+1);

  }
    // 6. Check if an array is sorted (strictly increasing)
    public static boolean ascending(int arr[],int index) {
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index]>arr[index+1]) {
            return false;
        }
       
       
        
        return  ascending(arr,index+1);
    }
    // 5. Find the maximum element in an array
    public static int max_in_array(int arr[],int max,int index) {
        if (index == arr.length) {
            return max;
        }
        max =Math.max(max, arr[index]);
       
    
        return  max_in_array(arr,max,index+1);
    }
    //4. Count number of digits in a number
    public static int count(int num,int digits){
            if(num == 0){
                return digits;
            }
             
            return count(num/10, digits+1);
          }
    // 3. Find the product of digits of a number
public static int print_Pro(int num,int sum){
            if(num == 0){
                return sum;
            }
            int rem = num%10;
             
            return print_Pro(num/10, sum*rem);
          }

// 2. Find the sum of digits of a number
    public static int print_Sum(int num,int sum){
            if(num == 0){
                return sum;
            }
            int rem = num%10;
             
            return print_Sum(num/10, sum+rem);
          }
        //1. Print elements of an array (forward and backward)
    public static void print_array(int arr[],int index) {
        if (index == arr.length-1) {
            return;
        }
        System.out.print(arr[index]);
        print_array(arr,index+1);
        System.out.println();
        System.out.print(arr[index]);

    }
}
