import java.util.*;
public class factorial {



    public static void fact(int num,int factorial) {
       if (num == 0 || num == 1){
        System.out.println(factorial);
        return;
       }
    
       fact(num-1,factorial*num);
    }
    public static int facto(int num,int factorial) {
        if (num == 0 || num == 1){
        
         return factorial;
        }
        
        return facto(num-1,factorial*num);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial =1;
        System.out.println(facto(num,factorial));
        fact(num,factorial);
       
    }


}
