import java.util.*;

public class sum_num {
    public static void sum(int num,int sum) {
       if (num == 0) {
        System.out.println(sum);
        return ;
       }
  sum+=num;
  sum(num-1,sum);
  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        sum(num,sum);
    }
}
