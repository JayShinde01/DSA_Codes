import java.util.*;

public class counting{
  public static void main(String[]args){
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
  // fibonaci(num);
  int nums[]={1,2,3,4,5};
System.out.println(sumArray(nums));
  }
  public static int count_digits(int num){
    int count_=0;
    while(num!=0){
      num /=10; 
      count_++;
    }
    return count_;
  }
  public static void count(int num,int even_count,int odd_count){
    if(num == 0){
      System.out.println(even_count);
      System.out.println(odd_count);
      return;
    }
    if((num%10)%2 == 0){
      even_count++;
    } 
    else{
      odd_count++;
    }   
    count(num/10,even_count,odd_count);
  }
  public static void fibonaci(int n){
    int n1=0,n2=1,sum = 0;
    System.out.print(n1+" "+n2);
      for (int i = 2; i <= n; i++) {
        sum=n1+n2;
        System.out.print(" "+sum);
        n1=n2;
        n2=sum;
      }
    }
    public static int random_number(){
      // Random r = new Random();
      // int rn = r.nextInt(100);
      // return rn;
      return (int )Math.random()*10;
    }
    public static int factorial(int num){
      if(num == 0 || num ==1){
        return 1;
      }
     
      return num*factorial(num-1);
    }
    public static int sumArray(int arr[]){
      int sum=0;
      int low=0,high=arr.length-1;
      while(low<=high){

        if (low == high) {
          sum=sum+arr[low];
          low++;high--;
        }else{
            sum=sum+arr[low]+arr[high];
            low++;high--;
        }
        
      }

      return sum;
    }
    public static boolean isEqual(int arr1[],int arr2[]){
      if(arr1.length!=arr2.length)return false;
      int i=0;
      while (i<arr1.length) {
        if (arr1[i] != arr2[i]) {
          return false;
          
        }
      }
      return true;
    }
  }
