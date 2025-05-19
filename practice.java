import java.util.*;
public class practice {
    public static void main(String[]args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //    int  t_sum=14;
       leader(matrix);
    }
    public static void leader(int mat[][]) {
        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                    int temp = mat[i][j];
                    mat[i][j]=mat[i][mat[0].length-1-j];
                    mat [j][mat[0].length-1-j] =temp;

                    System.out.print(" "+mat[i][j]);
                    
                
            }
            System.err.println();
        }
    }

    public static void alter_numbers(int[] arr) {
        int posIndex=0,negIndex=1;
        int []result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 0 && posIndex < arr.length) {
            result[posIndex] = arr[i];
            posIndex += 2;
        } else if (arr[i] < 0 && negIndex < arr.length) {
            result[negIndex] = arr[i];
            negIndex += 2;
        }
    }
        for (int j : result) {
                System.out.print(j);
            }
    }
    public static void subarray(int arr[],int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max=0;
        int prefixSum=0;

        for (int i = 0; i < arr.length; i++) {
          prefixSum +=arr[i];
          if (prefixSum == k) {
            max = Math.max(max, i+1);
          }
          int remain = prefixSum -k ;
          if (hm.containsKey(remain)) {
            int len = i-hm.get(remain);
            max = Math.max(max, len);
          }
          if (!hm.containsKey(prefixSum)) {
          hm.put(prefixSum, i);
            
          }
        }
        System.out.println(max);
        
    }

    public static void arrange(int arr[]) {
        int i=0,j=1;
        while (j < arr.length) {
            if (arr[i]>0) {
                i++;
                while (j < arr.length) {
                    if (arr[j]<0 && arr[j-1]>0) {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        j++;
                        i++;
                        break;
                    }
                    j++;

                }
            }
            else{
                i++;j++;
            }
        }
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
    public static void twos(int arr[]){

        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
            }
            else if(arr[mid]== 1){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else {
              mid++;
            }
           
            
        }
        for(int i :arr){
            System.out.print(i);
        }
       
    }
    public static void sum_pair(int arr[],int t_sum){
        // Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            
            int sum = arr[i]+arr[j];
            if(sum == t_sum){
                System.out.print(i+"  "+j);
                return ;
                
            }
            
            else if(sum<t_sum){
                i++;
            }
            else{
                j--;
            }
        }
        }
        
    
    public static int consequence(int arr[]){
        int count=0,max=0;
        for(int i =0 ; i< arr.length;i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=0;
            }
            // max=Math.max(max,count);
        }
        return max;
    }
}
