
import java.util.*;

public class jay{
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60,75,85};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = 0; i <arr.length; i++) {
            // Step a: Remove elements from stack <= current
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // Step b & c: Decide answer
            if (stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] =i- stack.peek();
            }

            // Step d: Push current element to stack
            stack.push(i);
        }

        // Print the result
        System.out.println("Next Greater Elements to Right:");
        System.out.println(Arrays.toString(ans));

}
}