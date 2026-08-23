import java.util.Stack;
import java.util.Scanner;
public class StackCode{
    public static void main(String []args){
        System.out.println("in stack class");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(baseBall(str));

    }
   
    public static int baseBall(String str){
        Stack<Integer> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '-')stack.push(-1);
            if(Character.isDigit(ch)){
                if(!stack.isEmpty() && stack.peek() == -1){
                    stack.push(0 -(ch - '0'));
                }
                else{
                    stack.push(ch - '0');
                }
            }
            else if(ch == 'C'){
                stack.pop();
            }else if(ch == 'D'){
                int lastEle = stack.peek();
                stack.push(lastEle * 2);
            }
            else if(ch == '+'){
                int last = stack.pop();
                int seclast = stack.peek();
                stack.push(last);
                stack.push(last + seclast);
            }
        }
        int sum = 0 ;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
    public static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if(c == '(' && ch != ')' ||
                   c == '[' && ch != ']' ||
                   c == '{' && ch != '}'
                ){return false;}
            }
        }
        return stack.isEmpty();
    }
}