import java.util.*;
public class product {
    

  
        public static void main (String []args){
             Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();
             System.out.println(print_Pro( num, 1));
             sc.close();
          }
          public static int print_Pro(int num,int sum){
            if(num == 0){
                return sum;
            }
            int rem = num%10;
             
            return print_Pro(num/10, sum*rem);
          }

}
