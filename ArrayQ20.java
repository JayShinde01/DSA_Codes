
import java.util.*;

public class ArrayQ20 {
    public static void main(String[] args) {
        int arr1[] ={0,1,1,1} ;
        int k=10;
        System.out.println(minimum_operations(arr1));  
    }
// 8. Minimum Operations to Make Binary Array Elements Equal to One I

    public static int minimum_operations(int[] nums) {
    int n = nums.length;
    int count = 0;

    for (int i = 0; i <= n - 3; i++) {
        if (nums[i] == 0) {
            nums[i] = 1 - nums[i];
            nums[i+1] = 1 - nums[i+1];
            nums[i+2] = 1 - nums[i+2];
            count++;
        }
    }

    for (int num : nums) {
        if (num != 1) return -1;
    }

    return count;
}


    //7. Partition Array According to Given Pivot
public static void Partition(int[] arr, int k) {
    int low = 0;
    int mid = 0;
    int high = arr.length - 1;

    while (mid <= high) {
        if (arr[mid] < k) {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
        } else if (arr[mid] == k) {
            mid++;
        } else { 
           
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
    }
    for (int i : arr) {
        System.out.println(i);
    }
}


    // 6. Lucky Numbers in a Matrix
     public static int Lucky_no(int mat[][]) {
        int min = Integer.MAX_VALUE;int num=-1;int min_index=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if ( min > mat[i][j]) {
                min = Math.min(min,mat[i][j])   ; 
                    min_index=j;
                }           
                    
                        
                    }
            
                }
                for (int j = 0; j < mat.length; j++) {
               num=Math.max(num, mat[j][min_index]);
                    }
        return num;

            }
          
        
        
    
//5. Minimum Operations to Make the Array Increasing
public static int operations_count(int arr[]) {
    int count=0;
   for (int i = 0; i < arr.length-1; i++) {
        if (arr[i]>arr[i+1]) {
            count+=(arr[i]-arr[i+1]+1);

            arr[i+1]=arr[i]+1;
        }
        else if (arr[i]==arr[i+1]) {
            arr[i+1]=arr[i+1]+1;
            count+=1;
        }
       
   }
    return count;
}
//4. Find the Difference of Two Arrays
   
   public static ArrayList<ArrayList<Integer>> diff(int[] arr1, int[] arr2) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                al1.add(arr1[i]);
            }
        }
        al.add(al1);

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                al2.add(arr2[i]);
            }
        }
        al.add(al2);

        return al;
    }



//3. Matrix Diagonal Sum
    public static int print_sum_d(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                if(i == j){
                    sum += mat[i][j];
                    if (i != mat[0].length-1-i) {
                    sum += mat[i][mat[0].length-1-i];
                        
                    }
                }
            }
            //  for (int j =  mat[0].length-1-i; j >=0 ; j--) {
            //     if(i != j){
            //         sum += mat[i][j];
            //     }
            // }
        }
        return sum;
        
    }

    // 2. Find the Highest Altitude
public static int highest_Altitude(int gain[]) {
    int max=0;
    int current=0;
    for (int i : gain) {
        current +=i;
        max=Math.max(max, current);
    }
    return max;
}


// 1. Count Equal and Divisible Pairs in an Array
public static int count_divisor(int arr[],int k) {
    int count=0;
    for (int i = 0; i < (arr.length); i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (i != j) {
               if (arr[i] == arr[j] && (i*j) % k == 0) {
                    count++;
               } 
            }
        }
    }
    return count;
}

//14. Removing Minimum and Maximum From Array

public static int remove_min_max(int arr1[]) {
    int max=Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    int n=arr1.length;
   for (int i = 0; i < n; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
                min = i;
            }
            if (arr1[i] > max) {
                max = arr1[i];
                max = i;
            }
        }

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        int deleteFromFront = max + 1;
        int deleteFromBack = n - min;
        int deleteFromBoth = (min + 1) + (n - max);

        return Math.min(deleteFromFront, Math.min(deleteFromBack, deleteFromBoth));
}



    // 13. Contiguous Array (grouped version)
    public static int Contiguous_Array2(int[] arr1) {
        int count = 0;
        int prev = 0;
        int current = 1;

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] == arr1[i - 1]) {
                current++;
            } else {
                count = Math.max(count, Math.min(prev, current) * 2);
                prev = current;
                current = 1;
            }
        }

        count = Math.max(count, Math.min(prev, current) * 2);
        return count;
    }



public static  int Contiguous_Array(int arr[]) {
    int count=0;int final_count=-1;
    int candidate=0;
    int vote=0;
    for (int i = 0; i < arr.length; i++) {
        if (vote==0) {
            candidate=arr[i];
            count++;
            vote++;
            final_count=Math.max(count, final_count);
            count=0;
        }
        else if(candidate == arr[i]){
            vote++;
            count++;
        
        }else{
            vote--;
            count++;

        }
    }
    return final_count;
}

    //19. Find First and Last Position of Element in Sorted Array

   public static int[] index(int arr[], int target) {
    return new int[]{first(arr, target), last(arr, target)};
}

public static int first(int arr[], int target) {
    int low = 0, high = arr.length - 1;
    int ans = -1;

    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            ans = mid;
            high = mid - 1;  
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans; 
}

public static int last(int arr[], int target) {
    int low = 0, high = arr.length - 1;
    int ans = -1;

    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            ans = mid;
            low = mid + 1; 
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans; 
}


    

    
}
