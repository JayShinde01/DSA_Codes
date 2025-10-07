import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        int arr[]={4, 5, 5, 2, 0, 4};
        // System.out.println(non_repeating(arr));
        duplicates(arr);
    }
//Question 3: Check for Duplicates in Array
 public static void duplicates(int arr[]) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
        hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);   
        }
        for (int key : hs.keySet()) {
        if (hs.get(key) >= 2) {
            System.out.println(key);
        }
    
    }
    }
    // Question 2: Find the First Non-Repeating Element
 public static int non_repeating(int arr[]) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
        hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);   
        }
         for (int i = 0; i < arr.length; i++) {
        if (hs.get(arr[i]) == 1) {
            return arr[i];
        }
    }
        return -1;
    }
    // Question 1: Count Frequency of Elements
    public static HashMap<Integer,Integer> count(int arr[]) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
        hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
            
        }
        return hs;
    }
}
