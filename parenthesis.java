
import java.util.*;

public class parenthesis{
    public static void main(String[] args) {
        String str = "(()())";
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
}