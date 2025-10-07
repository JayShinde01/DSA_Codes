import java.util.*;

public class demo {
    public static void main(String[] args) {
        int[] heights = {6, 2, 5, 4, 5, 1, 6};
        int maxArea = getMaxArea(heights);
        System.out.println("Maximum Area: " + maxArea);
    }

    public static int getMaxArea(int[] heights) {
        int n = heights.length;
        int[] NSL = new int[n];
        int[] NSR = new int[n];
        Stack<Integer> stack = new Stack<>();

        // NSL - Next Smaller to Left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSL[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear stack for NSR
        stack.clear();

        // NSR - Next Smaller to Right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            NSR[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Compute the maximum area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = NSR[i] - NSL[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}