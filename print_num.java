import java.util.*;

public class print_num{
    public  static void print_number(int num,int i){
        if (num+1 ==i) {
            return ;
        }
        System.err.print(i);
      
         print_number(num, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        print_number(num,1);
    }


}
