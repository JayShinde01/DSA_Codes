import java.util.*;
public class sum_of {
  
        public static void main (String []args){
             Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();
             System.out.println(print_Sum( num, 0));
             sc.close();
          }
          public static int print_Sum(int num,int sum){
            if(num == 0){
                return sum;
            }
            int rem = num%10;
             
            return print_Sum(num/10, sum+rem);
          }
    
    
}
