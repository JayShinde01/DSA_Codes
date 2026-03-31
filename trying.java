import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class trying {

      public static void main(String[] args) {
            int arr[]={1,2,9};
       
      //     System.out.println(divide(binary()));
      binary("11");
          
            
      }
  public static void binary(String x){
      int a = Integer.parseInt(x,2) ;
      System.out.print(a);
      }

  public static int divide(int dividend, int divisor) {
    int ans = dividend / divisor;

    if ((dividend < 0) ^ (divisor < 0)) {
        ans = -Math.abs(ans);
    } else {
        ans = Math.abs(ans);
    }

    return ans;
}


   
    public static int[] plusOne(int[] digits) {
       String s = Arrays.toString(digits);
        StringBuilder ans = new StringBuilder();
        int unitDigit = s.charAt(s.length()-1)-'0' + 1;
        ans.append(unitDigit%10);
         int borrow = unitDigit/10 ;
        
        for(int i = s.length()-1; i>=0;i--){
            int digit = s.charAt(i)-'0'+ borrow;
            if(digit > 9){
                ans.insert(0,digit%10);
                borrow = digit/10;
            }
            else{
                ans.insert(0,digit);
                borrow=0;
            }
        }
        String str = ans.toString();
        int [] answer = new int[str.length()];
        for (int i = 0;i<str.length();i++) {
            answer[i]=str.charAt(i)-'0';
        }
        
    return answer;

    }

      public static ArrayList<Integer> uniquIntegers(int arr[]){
            ArrayList <Integer> al = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                  int count = 0;
                  for (int j = 0; j < arr.length; j++) {
                        if ((i != j) && (arr[i] == arr[j])) {
                              count++;
                        }
                  }
                  if (count == 0) {
                        al.add(arr[i]);
                  }
                  
            }

            return al;
      }
      public static ArrayList<Integer> unique(int arr[]) {
            HashMap <Integer,Integer> map = new HashMap<>();
            ArrayList <Integer> al = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                  map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            for (int i : map.keySet()) {
                  if (map.get(i) == 1) {
                        al.add(i);
                  }
            }
            return al;
      }

      
      public static ArrayList<Integer> mergeList(int list1[],int list2[]){
            ArrayList <Integer> al = new ArrayList<>();
            int i=0;int j=0;
            while (i < list1.length && j < list2.length) {
                  if (list1[i]<= list2[j]) {
                        al.add(list1[i]);
                        i++;
                  }
                  else{
                        al.add(list2[j]);
                        j++;
                  }
            }
            while (i < list1.length) {
                  al.add(list1[i]);
                        i++;
            }
              while (j < list2.length) {
                  al.add(list2[j]);
                        j++;
            }
            return al;

      }

      public static int waterPlant(int plants[], int capacity){
            int temp_capacity=capacity, steps=1;int ans = 0;
            for (int i = 0; i < plants.length; i++) {
                  if (plants[i] <= capacity) {
                        capacity -= plants[i];
                        ans += steps;
                  }
                  else{
                        capacity=temp_capacity;
                        ans += 2*i+1;
                        capacity -= plants[i];
                  }
            }

            return ans;
      }



      public static int[] twoSum(int arr[],int k){
            HashMap <Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                  int x = map.getOrDefault(k - arr[i], -1);
                  if(x != -1){
                         return new int[] {i,x};
                  }
                  map.put(arr[i], i);
            }
            return new int[] {-1,-1};
      }


      public static int sumSubArrays(int arr[]){
            int sum =0; 
            for(int i=0 ; i<arr.length;i++){
                  for (int j = i; j < arr.length; j++) {
                        for (int k = i; k <= j ; k++) {
                              System.out.print(arr[k]);
                              sum += arr[k];
                        }
                              

                        System.out.println();
                  }
            }
            return sum;
      }

      public static int countSubArrays(int arr[]){
            int count =0; 
            for(int i=0 ; i<arr.length;i++){
                  for (int j = i; j < arr.length; j++) {
                        for (int k = i; k <= j ; k++) {
                              System.out.print(arr[k]);
                        }
                              count++;

                        System.out.println();
                  }
            }
            return count;
      }


      
public static void printSubArrays(int arr[]){
      for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                   for (int j = i; j <=k; j++) {
                  System.out.print(arr[j]);
            }
            System.out.println();
            }
           
            
      }
      
}  

public static boolean isArmStrong(int num){
      int temp =  num ; 
      int sum = 0 ;
      int count = 0; 
      while(temp != 0){
            count++;
            temp /= 10 ;
      }
      temp =num;
      while (temp != 0){
            sum += Math.pow(temp%10, count);
            temp /= 10;
      } 
      return sum == num ;
}

      public static boolean isDuckNumber(int num) {
    if (num == 0) return false;
    // Remove trailing zeros and check digits
    while (num > 0) {
        if (num % 10 == 0) return true;
        num /= 10;
    }
    return false;
}
public static boolean isStrong(int num){
      int fact[]={1,1,4,6,24,120,720,5040,40320,362880};
      int temp = num ;int sum=0;
      while(temp != 0){
            sum += fact[temp%10];
            temp /=10;
      }
      return sum == num ;
}

      public static int[] frequencies(int num){
            int ans[] = new int[10];
            while (num != 0) {
                  ans[num%10]++;
                  num /= 10;
            }
            return ans;
      }
}