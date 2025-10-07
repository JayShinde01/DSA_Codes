import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        System.out.println(LongSubArray(arr, 6));
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]<arr[j]) {
        //             break;
        //         }
        //         else if (j==arr.length-1) {
        //             System.out.print(arr[i]);
        //         }
        //     }
        // }
        // System.out.print(arr[arr.length-1]);
    }
     public static int SubArray(int arr[],int k) {
        int sum =0,count=0;
        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum = sum +arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
        
    }
    //    public static int LongSubArray(int arr[],int k) {
    //     int sum =0,len=0,max=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum =0;len=0;
    //         for (int j = i; j < arr.length; j++) {
    //             sum = sum +arr[j];
    //             len++;
    //             if (sum == k) {
    //                 max=Math.max(len,max);
                    
    //             }
    //         }
    //     }
    //     return max;
        
    // }
  
    public static int LongSubArray(int[] arr, int k) {
        HashMap <Integer,Integer> hm= new HashMap<>();
          int ps =0,maxLen=0;
          hm.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            ps += arr[i];
               if (hm.containsKey(ps - k)) {
                maxLen = Math.max(maxLen, i - hm.get(ps - k));
            }
            hm.put(ps,hm.getOrDefault(ps,i)+1);
        }
        return maxLen;
    }
    class Node{
        int data;
        List <Node> children=new ArrayList<>();
        public Node (int data){
            this.data=data;
        }
    }

}
