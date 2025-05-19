
import java.util.*;

public class ArrayQ20 {
    public static void main(String[] args) {
        int arr1[] = {0, 1, 1, 1, 0, 0};
        System.out.println(remove_min_max(arr1));  // Output: 4
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
}
