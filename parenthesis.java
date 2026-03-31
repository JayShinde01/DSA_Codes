
import java.util.*;

public class parenthesis{
    public static void main(String[] args) {
        String str = "(()())";
       
System.out.println(validParenthesis(str));
}
public static void validParenthesis1(String str) {
     Stack<Character> stack = new Stack<>();
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if(!stack.isEmpty() && str.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
                count+=2;  
            }
            else{
                max = Math.max(max,count);
                count=0;
            }
        }
        System.out.println(max);
}
public static String validParenthesis(String s){
    StringBuilder ans = new StringBuilder();
    int count = 0 ;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            if (count > 0 ) {
                ans.append(s.charAt(i));
            }
            count++;
        }
        else{
            count--;
            if(count>0){
                ans.append(s.charAt(i));
            }
        }
    }
    return ans.toString();
}
}