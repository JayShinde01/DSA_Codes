import java.util.*;
class Infosys{
    public static void main(String[]args){
        System.out.println("Preparing for Infosys 💸😎..");
        int arr1[] = {1,2,4,4};
        int arr2[] = {1,2,3,4,5};
        // System.out.println(Arrays.toString(moveAllZeros(arr)));
        System.out.println(unionOfArray3(arr1,arr2));
        
    }
    public static HashSet<Integer> unionOfArray3(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        int i = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                set.add(arr1[i]);
                i++;
            }
            else{
                set.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length ){
                set.add(arr1[i]);
                i++;          
        }
         while(j < arr2.length ){
                set.add(arr2[j]);
                j++;          
        }
        return set;
    }
    public static TreeSet<Integer> unionOfArray2(int arr1[],int arr2[]){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        return set;
    }
    public static ArrayList<Integer> unionOfArray1(int arr1[],int arr2[]){
        ArrayList<Integer> al = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                al.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                al.add(arr1[i]);
                i++;
            }
            else{
                al.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length ){
            if(al.get(al.size()-1) != arr1[i])
                al.add(arr1[i]);
                i++;          
        }
         while(j < arr2.length ){
            if(al.get(al.size()-1) != arr2[j])
                al.add(arr2[j]);
                j++;          
        }
        return al;
    }
    public static ArrayList<Integer> unionOfArray(int arr1[],int arr2[]){
        ArrayList<Integer> al = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                al.add(arr1[i]);
                i++;
            }
            else{
                al.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length ){
                al.add(arr1[i]);
                i++;          
        }
         while(j < arr2.length ){
                al.add(arr2[j]);
                j++;          
        }
        return al;
    }
    public static int isPresent1(int arr[],int k){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid+1; 
            }
            else if(arr[mid] > k){
                end = mid-1;
            }
        }
        return -1;
    }
    public static int isPresent(int arr[], int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void swap(int arr[],int a,int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int[] moveAllZeros(int arr[]){
        int j = 0 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
              swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }
    public static int[] rightRotateArray1(int arr[],int k){
        k = k % arr.length;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        return arr;
    }
    public static int[] rightRotateArray(int arr[], int k){
        k = k % arr.length;
        int ans[] = new int[arr.length];
        int index = 0;
        for(int i = arr.length - k ; i < arr.length ; i++){
            ans[index++] = arr[i];
        }
        for(int i = 0 ; i < arr.length-k ; i++){
            ans[index++] = arr[i];
        }
        return ans;
    }
    public static int[] leftRotateArray1(int arr[],int k){
        k = k % arr.length;
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        return arr;
    }
    public static void reverseArray(int arr[],int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] leftRotateArray(int arr[], int k){
        k = k % arr.length;
        int index = 0;
        int ans[] = new int[arr.length];
        for(int i = k; i < arr.length; i++){
            
            ans[index++] = arr[i] ;
        }
        for(int i = 0 ; i < k; i++){
            ans[index++]=arr[i];
        }
        return ans;
    }
    public static int[] removeDuplicates(int arr[]){
        int j = 0;
        for(int i = 1 ; i < arr.length ;  i++){
            if(arr[j] != arr[i] ){
                  j++;
                arr[j] = arr[i];
              
            }
        }
        return arr;
    }
}
