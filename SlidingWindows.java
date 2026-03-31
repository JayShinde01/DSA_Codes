import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindows {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,7};
        int k = 3;
        System.out.println(slidingWindow(arr,k));
    }
////Sliding window approach
    public static int Sliding(int []arr,int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum =sum +arr[i];
        }
        int maxSum=sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum -arr[i-k];
            sum = sum + arr[i];
             maxSum = Math.max(maxSum, sum);

        }
        return maxSum ;
    }

    public static int SlidingWindows(int []arr, int k){
        int sum = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
       for(int i = 0 :i < arr.length : i++){
        sum = arr[i - k ];
        aum += arr[i];
         
       }
    }

///First negative in every window of size 
///Brute force approach
    public static void FirstNegative(int arr[],int k) {
     

        for (int i = 0; i <= arr.length - k; i++) {
            boolean found = false;
            for (int j = i; j < i + k; j++) {  
                if (arr[j] < 0) {
                    System.out.print(arr[j]+" ");
                    found=true;
                    break;
                }           
            }
           if (!found) {
            System.out.print(0+" ");
           }
        }

      
    }
    public static int maxSum(int arr[],int k){
        int sum = 0 ; 
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        int max = sum ;
        for(int i = k ; i < arr.length ; i++){
            sum -= arr[i-k]; 
            sum += arr[i]; 
           max =  Math.max(max,sum);
        }
        return max;
    }
///Optimal approach
    public static void FirstNegative2(int arr[],int k) {
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        int j = 0;
        while(j< arr.length){

            if (arr[j]<0) {
                q.add(arr[j]);
            }

            if (j-i +1< k) {
                j++;
            }
            else if (j-i+1 ==k) {
                if (!q.isEmpty()) {
                    System.out.println(q.peek());
                }else {
                    System.out.println("0");
                }

                if (!q.isEmpty()&& arr[i]== q.peek()){
                    q.poll();
                } 
                    i++;
                    j++;

            }
    }
    
}}
