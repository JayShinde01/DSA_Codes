import java.util.ArrayList;

public class Countsubsecquence {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        int result = Countsub(arr , 0 , new ArrayList<>(), k ,0,0);
        System.out.print(result);
    }

    public static int Countsub(int[]arr, int ind, ArrayList<Integer>al , int k , int sum , int count ){
        if (ind == arr.length) {
            if (sum == k) {
                count++;
                return 1;
            }
            return 0;
        }
            al.add(arr[ind]);
        count += Countsub(arr, ind+1, al, k, sum +arr[ind], 0);
         al.remove(al.size()-1);
        count += Countsub(arr, ind+1, al, k, sum, 0);
         return count;
        }
} 
