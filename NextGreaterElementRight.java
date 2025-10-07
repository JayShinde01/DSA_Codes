
import java.util.*;

public class NextGreaterElementRight {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Step a: Remove elements from stack <= current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Step b & c: Decide answer
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            // Step d: Push current element to stack
            stack.push(arr[i]);
        }

        // Print the result
        System.out.println("Next Greater Elements to Right:");
        System.out.println(Arrays.toString(ans));
    }
}
