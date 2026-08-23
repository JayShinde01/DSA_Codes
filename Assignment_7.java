public class Assignment_7{
    public static void main(String[] args) {
        System.out.println("Assignment no - 7");
        int []nums = {1,-5,4,-7,2};
        int target = 2;
        
        System.out.println(countDivisible(nums, 0,0 , 2));
    }
    /**
     * 1. Find First Occurrence
        👉 Return index of first occurrence of target
        Input: arr = [5,2,3,2,4], target = 2
        Output: 1
     */
    public static int first_Occurence(int nums[],int target, int i){
        if(nums.length == i){
            return -1;
        }
        if(nums[i] == target){
            return i;
        }
        return first_Occurence(nums, target, i+1);
    }
    /**
     * Q2. Find Last Occurrence
        👉 Return index of last occurrence of target
        Input: [5,2,3,2,4], target = 2
        Output: 3
     */
    public static int lastOccurence(int nums[],int target,int i){
        if(i == -1){
            return -1;
        }
        if(nums[i] == target){
            return i;
        }
        return lastOccurence(nums, target, i-1);
    }
    /**
     * Q3. Count Occurrences
        👉 Count how many times target appears
        Input: [1,2,2,3,2], target = 2
        Output: 3
     */
    public static int countOccurence(int nums[],int targate, int i,int count){
        if(nums.length == i){
            return count;
        }
        if(targate == nums[i]){
            count++;
        }
        return countOccurence(nums, targate, i+1, count);
    }
    /**
     * Q4. Check if Array is Sorted
    👉 Return true if sorted in ascending order
    Input: [1,2,3,4]
    Output: true
     */
    public static boolean isSorted(int nums[], int i){
        if(nums.length-1 == i){
            return true;
        }
        if(nums[i] > nums[i+1]){
            return false;
        }
        return isSorted(nums, i+1);
    }
    /**
     * Q5. Check if All Elements are Even
    👉 Return true if all elements are even
    Input: [2,4,6]
    Output: true

     */
    public static boolean isAllEven(int nums[],int i){
        if(nums.length == i){
            return true;
        }
        if(nums[i] % 2 != 0){
            return false;
        }
        return isAllEven(nums, i+1);
    }
    /**
     * Q6. Check if Any Element is Negative
    👉 Return true if at least one negative exists
    Input: [1,2,-3,4]
    Output: true
     */
    public static boolean isAllNegative(int nums[], int i){
        if(nums.length == i){
            return true;
        }
        if(nums[i] % 2 == 0){
            return false;
        }
        return isAllNegative(nums, i+1);
    }
    /**
     * Q7. Find Maximum Element
    👉 Return maximum value in array
    Input: [3,9,1,7]
    Output: 9
     */
    public static int maxElement(int nums[], int i,int max){
        if(nums.length == i){
            return max;
        }
        if(nums[i] > max){
            max = nums[i];
        }
        return maxElement(nums, i+1, max);
    }
    /**
     * Q8. Find Minimum Element
        👉 Return minimum value
        Input: [3,9,1,7]
        Output: 1
     */
    public static int minElement(int nums[], int i, int min){
        if(nums.length == i){
            return min;
        }
        if(nums[i] < min){
            min = nums[i];
        }
        return minElement(nums, i+1, min);
    }
    /**
     * Q9. Sum of Elements at Odd Index
        👉 Return sum of elements at index 1,3,5...
        Input: [10,20,30,40,50]
        Output: 20 + 40 = 60
     */
    public static int sumOddIndex(int nums[], int i, int sum){
        if(nums.length == i){
            return sum;
        }
        sum += nums[i];
        return sumOddIndex(nums, i+2, sum);
    }
    /**
     * Q10. Check Palindrome Array
        👉 Return true if array is palindrome
        Input: [1,2,3,2,1]
        Output: true

     */
    public static boolean isArrayPalindrom(int nums[], int i, int j){
        if(i > j){
            return true;
        }
        if(nums[i] != nums[j]){
            return false;
        }
        return isArrayPalindrom(nums, i+1, j-1);
    }
    /**
     * Q11. Find Second Maximum
        👉 Return second largest element
        Input: [10,5,8,20,15]
        Output: 15
     */
    public static int secondMax(int nums[],int i,int max,int secMax){
        if(nums.length == i){
            return secMax;
        }
        if(nums[i] > max ){
            secMax = max;
            max = nums[i];
        }
        if(nums[i] > secMax && nums[i] < max){
            secMax = nums[i];
        }
        return secondMax(nums, i+1, max, secMax);
    }
    /**
     * Q12. Check Strictly Increasing
        👉 Return true if strictly increasing (no equal allowed)
        Input: [1,2,3,3]
        Output: false
     */
    public static boolean isStrictlyInc(int nums[],int i){
        if(nums.length-1 == i){
            return true;
        }
        if(nums[i] >= nums[i+1]){
            return false;
        }
        return isStrictlyInc(nums, i+1);
    }
    /**
     * Q13. Count Elements Greater Than X
        👉 Return count of elements greater than given value
        Input: arr = [1,5,3,7,2], x = 3
        Output: 2
     */
    public static int countGreaterThanX(int nums[],int i,int x, int count){
        if(nums.length == i){
            return count;
        }
        if(x < nums[i]){
            count++;
        }
        return countGreaterThanX(nums, i+1, x, count);
    }
    /**
     * Q14. Check if Array Contains Target
        👉 Return true if target exists
        Input: [1,2,3,4], target = 3
        Output: true
     */
    public static boolean isPresent(int nums[], int i, int target){
        if(nums.length == i){
            return false;
        }
        if(nums[i] == target){
            return true;
        }
        return  isPresent(nums, i+1, target);
    }
    /**
     * Q15. Find Sum of All Negative Numbers
        👉 Return sum of all negative elements
        Input: [1,-2,3,-4,5]
        Output: -6

     */
    public static int sumNegatives(int nums[],int i,int sum){
        if(nums.length == i){
            return sum;
        }
        if(nums[i] < 0){
            sum += nums[i];
        }
        return sumNegatives(nums, i+1, sum);
    }
    /**
     * Q16. Find Index of Smallest Element
        👉 Return index of minimum element
        Input: [5,2,8,1,3]
        Output: 3

     */
    public static int minEleIndex(int nums[], int i,int index,int min){
        if(nums.length == i){
            return index;
        }
        if(nums[i] < min ){
            index = i;
            min = nums[i];
        }
        return minEleIndex(nums, i+1, index, min);
    }
    /**
     *Q17. Count Elements Divisible by K
        👉 Return count of elements divisible by k
        Input: [2,4,5,6,9], k = 2
        Output: 3
     */
    public static int countDivisible(int nums[],int i,int count,int k){
        if(nums.length == i){
            return count;
        }
        if(nums[i] % k == 0){
            count++;
        }
        return countDivisible(nums, i+1, count, k);
    }
    /**
     * Q18. Check if All Elements are Unique
        👉 Return true if no duplicates exist
        Input: [1,2,3,4]
        Output: true
     */
    // public static boolean areUniques(int nums[],int i,int index){
    //     if(nums.length == index){
    //         return true;
    //     }
    //     while(nums.length != i){
    //         if(nums[i])
    //     }
    // }
    }