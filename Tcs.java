import java.util.*;


public class Tcs{
    public static void main(String args[]){
     String s ="7L 7R 7L 8L 6R 7R 8R 6R" ;
   
    }


    public static void majja1(int n){
        if(n == 0){         
            return ;
        }
        majja1(n-1);
        System.out.println("100");
        majja1(n-1);


    }
    public static void majja(int n){
        if(n == 0){
            System.out.println("500");
            return ;
        }
        if(n == 1){
            System.out.println("600");
            return ;
        }
            System.out.println("100");
            majja(n-2);
            System.out.println("200");
            majja(n-2);
            System.out.println("300");


    }
    public static int shoesPair(String str){
        String arr[] = str.split(" ");
        HashMap<Character, Integer> leftSide = new HashMap<>();
        HashMap<Character, Integer> rightSide = new HashMap<>();

        for(String s : arr){
            char size = s.charAt(0);
            char side = s.charAt(s.length()-1);
            if(side == 'L'){
                leftSide.put(size,leftSide.getOrDefault(size,0)+1);
            }
            else{
                rightSide.put(size,rightSide.getOrDefault(size,0)+1);
            }
        }
        int ans = 0;
        for(char ch : leftSide.keySet()){
            if(rightSide.containsKey(ch)){
                ans += Math.min(leftSide.get(ch),rightSide.get(ch));
            }
        }
    return ans;

    }
    public static void fiboonac(int n){
        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int i = 0 ; i <= n ; i++){
            c = a + b; 
            System.out.print(" "+c);
            a = b;
            b = c;
        } 
    }
    public static int fibbo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int a = fibbo(n - 1 );
        int b = fibbo(n - 2 );
        return a + b; 
    }
     public static void hollowButterfly(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i+j == n+1 || i == j || j == 1 || j == n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList> difference(int arr1[], int arr2[]){
        ArrayList<ArrayList> ans = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++){
            boolean flag = true;
            for(int j = 0 ; j < arr2.length ; j++ ){
                if(arr1[i] == arr2[j]){
                    flag = false;
                }
            }
            if(flag){
                al1.add(arr1[i]);
            }
        }
        for(int i = 0 ; i < arr2.length ; i++){
            boolean flag = true;
            for(int j = 0 ; j < arr1.length ; j++ ){
                if(arr2[i] == arr1[j]){
                    flag = false;
                }
            }
            if(flag){
                al2.add(arr2[i]);
            }
        }
        ans.add(al1);
        ans.add(al2);
        return ans;
    }
    public static int diagonalSum(int mat[][]){
        int sum = 0 ;
        for(int i = 0 ; i<mat.length; i++){
            for(int j = 0 ; j < mat[i].length;j++){
                if(i == j || i+j == mat[i].length-1)
                    sum += mat[i][j];
            }
        }
        
        return sum;
    }
    public static int highestAltitude(int []arr){
        int altitude = 0 ;
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            altitude += arr[i];
            max = Math.max(max,altitude);
        }
        return max;
    }
     
    public static int countEqual(int []arr, int k){
        int count=0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    int mul = i * j ;
                    if(mul % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static ArrayList<Integer> Intersection(int arr1[], int arr2[]){
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0 ;
        int j = 0 ;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                al.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return al;
    }
    public static int thirdLargest(int []arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }
            else if( arr[i] > secondMax && arr[i] != max){
                thirdMax = secondMax;
                secondMax = arr[i];
            }
            else if(arr[i] > thirdMax && (arr[i] != secondMax && arr[i] != max)){
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }
    public static int findSmallest(int[]arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
    public static int findLargest(int[]arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]> secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int findFirstOccurence(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                System.out.println(map.get(i));
                return i;
            }
        }
    
        return -1;
    }
    public static HashMap<Integer,Integer> hashedArray(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map;
    }
    public static int countAppearance(int n , int k ,int count){
        if(n == 0){
            return count;
        }
        if(n % 10 == k) count++;
        return countAppearance(n/10, k , count);
    }
    public static int reverseNumber(int n , int rev){
        if(n == 0){
            return rev; 
        }
        rev = rev * 10 + n % 10 ;
        return reverseNumber(n/10 , rev);
    }
    public static int lastIndex(int arr[],int target,int i){
        if(i < 0)return -1;
        if(arr[i] == target){
            return i;
        }
        return lastIndex(arr,target,i-1);
    }
    public static int firstIndex(int arr[],int target,int i){
        if(i == arr.length)return -1;
        if(arr[i] == target)return i+1;
        return firstIndex(arr,target,i+1);
    }
    public static boolean isPrimeRecursion(int n , int i){
        if( Math.sqrt(n) < i)return true; 
        if( n == 2 || n == 3) return true;
        if( n%2 == 0 || n == 1) return false;
        return isPrimeRecursion(n,i+1);

    }

    public static boolean isSorted(int [] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] >= arr[i+1])return false;
        return isSorted(arr,i+1);
    }
    public static int maxInarray(int [] arr , int i, int max){
        if( i == arr.length) return max;
        
        return maxInarray(arr,i+1,Math.max(arr[i],max));
    }
    public static int countDigit(int n, int digits){
        if(n == 0)return digits;
        return countDigit(n/10,digits=digits+1);
    }
    public static int ProductOfDigits(int n , int product){        
        if(n == 0) return product;

        return ProductOfDigits(n/10,product *= n%10);      
    }

   public static int SumOfDigits(int n , int sum){
    if(n == 0){
        return sum;
    }
    return SumOfDigits(n/10,sum += n % 10);
   }
    

    public static void printArray(int arr[],int i){
         if( i == arr.length){
            System.out.println();
            return ;
         }
         System.out.print(" "+arr[i]);
         printArray(arr,i+1);
         System.out.print(" "+arr[i]);
    }

    public static boolean isArmstrong(int n){
        ArrayList <Integer> al = new ArrayList<>();
        int digits=0;
        int temp = n ;
        while(temp != 0){
            digits++;
            al.add(temp%10);
            temp /= 10;
        }
        int sum = 0 ;
        for(int i : al){
            sum += Math.pow(i , digits);
        }
        return sum == n;
    }
    public static ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1 ; i <= n/2 ; i++){
            if(n % i == 0){
                al.add(i);
            }     
        }
         al.add(n);
        return al;
    }
    public static boolean isPrime(int n){
        if(n < 1)return false;
        if( n != 2 && n % 2 == 0 )return false;
        if(n == 3 || n == 2)return true;
        for(int i=3 ; i * i <= n ; i++ ){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        int temp = n ;
        int rev = 0 ;
        while(temp != 0){
            rev = rev *10 + temp%10; 
            temp /= 10;
        }
        if(rev  != n) return false;
        return true;
    }
    public static int CountDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n /10;
        }
        return count;
    }
    public static void Spriral(int n){
        for(int i = 1 ; i <=n+2 ; i++){
            for(int j = 1 ; j <= n+2; j++){
                if(i == 1 || j == 1 || i == n+2 || j==n+2){
                    System.out.print(n);
                }
                else if(i == 2 || j == 2 || i == n+2-1 || j==n+2-1){
                    System.out.print(n-i+1);
                }
                else{
                    System.out.print(n-2);
                }
            }
            System.out.println();
        }
    }
    public static void Cross(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i+j == n+1 || i == j)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i = 1 ; i <= n ; i++){
            
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= n*2 - i*2 ; j++){
                System.out.print(" ");
            }
             for(int j = i; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n ; i++){
            
            for(int j = 1; j <= n-i+1 ; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= i*2 - 2 ; j++){
                System.out.print(" ");
            }
             for(int j = n - i + 1; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    public static void Pyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= n - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n-1 ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i ; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    public static  void chessboard(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

 public static void triangle1(int n){
        for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= n - i + 1 ; j++){
               
                    System.out.print("* ");

        }
        System.out.println();

        }
    

    }
    public static void triangle(int n){
        for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= i ; j++){
               
                    System.out.print("* ");

        }
        System.out.println();

        }
    

    }
    public static void Diagonal(int n){
        for(int i = 0 ; i <= n ; i++){
             for(int j = 1 ; j <= n ; j++){
                if(i == j || i+j == n+1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
        }
        System.out.println();

        }
    

    }
    public static void hollow(int n){
        for(int i = 0 ; i <= n ; i++){
             for(int j = 1 ; j <= n ; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
        }
        System.out.println();

        }
    

    }
    public static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            boolean flag = true;
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    flag = false;
                    break;
                }
                
            }
            if(flag){
                al.add(arr[i]);
            }
            

        }
        return al;
    }

    public static int[] arrangeSigns(int arr[]){
        int ans[] = new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg = neg + 2 ;
            }
            else{
                ans[pos] = arr[i];
                pos = pos + 2 ;
            }
        }
        return ans;
    }
    public static int sellStock(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    max =  Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        return max;
    }


    public static int moreThanHalf(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static int[] zeros21(int arr[]){
        int left=0;
        int mid = 0 ;
        int right=arr.length-1;

        while(mid < right){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left]=temp;
                left++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp =  arr[right] ;
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }
        return arr;

    }

    public static int[] zeros12(int arr[]){
        int ones=0, twos=0,zeros=0;
        for(int i : arr){
            if(i == 0){
                zeros++;
            }
            else if(i == 1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0;i < zeros ; i++){
            arr[i]=0;
        }
        for(int i=zeros;i < zeros+ones ; i++){
            arr[i]=1;
        }
        for(int i=zeros+ones;i < zeros+ones+twos ; i++){
            arr[i]=2;
        }
        return arr;
    }

    public static int[] twoSum(int arr[],int k){
        HashMap <Integer,Integer> map = new HashMap<>();    
        map.put(1,0);
        for(int i = 0 ; i < arr.length ; i++){
            int x = map.getOrDefault(k - arr[i],-1);
            if(x != -1){
               return new int[]{i,map.get(k - arr[i])};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSum2(int arr[], int k){
        HashMap <Integer,Integer> map =  new HashMap<>();

        for(int i=0 ; i < arr.length; i++){
            map.put(arr[i],i);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(k - arr[i])){
                return new int[]{i,map.get(k - arr[i])};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSum1(int arr[], int k){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j=i+1 ; j< arr.length ; j++){
                if(arr[i]+arr[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int countOnes(int arr[]){
        int max = 0;
        int count=0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 1){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }

    public static int appearsOnce1(int arr[]){
        int result = 0;
       for(int i : arr){
        result ^= i;
       }
       return result;
    }

    public static int appearsOnce(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }

    public static int [] movesZeros(int arr[]){
        int j=0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }

    public static int[] rigthrotateArr(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        reverseArr(arr,n-k,n-1);
        reverseArr(arr,0,n - k - 1);       
        reverseArr(arr,0,n-1);
        return arr;
    }

    public static int[] leftrotateArr(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);
        reverseArr(arr, 0, n - 1);
        return arr;
    }

    public static int[] removeDuplicates(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return arr;
    }
    public static void reverseArr(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void printArr(int arr[]){
       
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
