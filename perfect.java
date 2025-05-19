import java.util.*;

public class perfect {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        int check = 0;
       System.out.println(is_Perfect(num,check,1));
    }
public static boolean is_Perfect(int num,int check,int i){
    if(num == i){
        if(num == check){
            return true;
        }
        else{
            return false;
        }
    }
    if (num % i == 0) {
        check+=i;
        
    }
    return is_Perfect(num,check,i+1);
}
}
