import java.util.*;

public class count{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(count_digits(num)); 

  }
  public static int count_digits(int num){
    int count_=0;
    while(num!=0){
      num /=10; 
      count_++;
    }
    return count_;
  }
}