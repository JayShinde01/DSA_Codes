import java.util.*;
class Infosys{
    public static void main(String[]args){
        // System.out.println("Preparing for Infosys 💸😎..");
        // int arr1[] = {7,1,5,3,6,4};
        int arr2[] = {1,2,3};
        // System.out.println(Arrays.toString(sortArray(arr1)));
        System.out.println(findLcm(12, 18));
        printN(3);

        // printSubsets(arr2,new ArrayList<>(),new ArrayList<>(),0,arr2.length);
    }
    public int fact(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return n * fact(n - 1);
    }
    public int sumOf(int n,int sum){
        if(n == 0){
            return sum;
        }
        return sumOf(n/10, sum += n%10);
    }
    public static void printN(int n){
    if(n == 0){
        return;
    }
    System.out.println("X");
    printN(n-1);
    System.out.println("Y");
    printN(n-1);
    
    }
public static void printElements(int nums[],int i){
    if(nums.length <= i){
        return;
    }
    System.out.println(nums[i]);
    printElements(nums, i+1);
    System.out.println(nums[i]);
    
}
public static int findLcm(int n1,int n2){
    return n1*n2/findGcd(n1,n2);
}
//n1 ==> 12 
//n2 ==> 6
public static int findGcd(int n1,int n2){
    int min = Math.min(n1,n2);
    int gcd = 1;
    for(int i = 2;i <= min; i++){
        if(n1 % i == 0 && n2 % i == 0){
           gcd = Math.max(i,gcd);
        }
    }
    return gcd;
}
//print all subsets
public static void printSubsets(int nums[], List<List<Integer>> ans,
                                List<Integer> ls, int index, int n) {

    ans.add(new ArrayList<>(ls));
    System.out.println("Subset: " + ls);

    for(int i = index; i < n; i++) {

        if(i > index && nums[i] == nums[i-1]) {
            System.out.println("Skipped duplicate: " + nums[i]);
            continue;
        }

        ls.add(nums[i]);
        System.out.println("Added: " + nums[i] + " -> " + ls);

        printSubsets(nums, ans, ls, i + 1, n);

        System.out.println("Before remove: " + ls);

        ls.remove(ls.size() - 1);

        System.out.println("After remove: " + ls);
    }
}
//[7,1,5,3,6,4] ==> 5
public static int stockBuySell1(int arr[]){
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] < minPrice){
            minPrice = arr[i];  // buy at lowest
        } else {
            int profit = arr[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
    }
    return maxProfit;
}
    public static int stockBuySell(int arr[]){
        int max = 0;
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1; j < arr.length; j++){
                int dif = arr[j]-arr[i];
                if(max < dif){
                    max = dif;
                }
            }
        }
        return max;
        
    }
    String s = new  String();
//[1,2,3,3,3,4] ==> 3
    public static int maximumCount1(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        int val = 0;
        for(int i : map.keySet()){
            if(max < map.get(i)){
                max = map.get(i);
                val=i;
            }
            
        }
        return val;
    }
    public static int maximumCount(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
//[2,0,1,0,2,1,0,2] ==> [0,0,0,1,1,2,2,2]
    public static int[] sortArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(i < right){
            if(arr[i] == 0 ){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;i++;
            }
            else if(arr[i] == 2){
                int temp = arr[right];
                arr[right] = arr[i];
                arr[i] = temp;  
                right--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
//[2,7,11,15], target=9 → [2,7]
// [3,3], target=6 → [3,3]
    public static int[] twoSum2(int arr[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0 ; i < arr.length; i++){
            
            int x = map.getOrDefault(target-arr[i],-1);
            // System.out.println(x);
            if(x != -1){
                return new int[]{target-arr[i],arr[i]};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum1(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            map.put(arr[i], i);
        }
        for(int i = 0 ; i < arr.length; i++){
            int num = target - arr[i];
            if(map.containsKey(num)){
                return new int[]{arr[i],num};
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum(int arr[],int target){
        for(int i=0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] + arr[j] == target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
// [1,1,0,1,1,1] → 3
// [0,0,0] → 0
    public static int maxOnes1(int arr[]){
        int max = 0 ; 
        int count = 0 ;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 1){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count = 0 ;
            }
        }
        return max;

    }
    public static int maxOnes(int arr[]){
        int maxlenth = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0 ;
            for(int j = i; j < arr.length; j++){
                if(arr[j] != 1){
                    break;
                }
                count++;
                maxlenth = Math.max(count,maxlenth);
            }
        }
        return maxlenth;
    }
// [2,2,1] → 1
// [4,1,2,1,2] → 4
    public static int onceAppear(int arr[]){
        for(int i=0; i < arr.length; i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count > 1){
                    break;
                }

            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int onceAppear1(int arr[]){
    int xor = 0;
    for(int num : arr){
        xor ^= num;
    }
    return xor;
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

// isPresent1(new int[]{1,2,3,4,5}, 5) → 4
// isPresent1(new int[]{1,2,3,4,5}, 1) → 0
// isPresent1(new int[]{1,2,3,4,5}, 6) → -1
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
//[0,1,0,3,12] → [1,3,12,0,0]
//[0,0,0] → [0,0,0]
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
//[1,2,3,4,5], k=2 → [4,5,1,2,3]
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
//[1,2,3,4,5], k=2 → [3,4,5,1,2]
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
// [1,1,2,2,3] → [1,2,3,_,_]
// (valid size = j+1)
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
