
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Assignment_8{
    public static void main(String[] args) {
        System.out.println("Assignment no - 8 ");
        int nums[] = {1,2,2,2,3,3,3,4,4,4};
        System.out.println(isPanagram2("thequickbrownfoxjumpsoverthelazydog"));
        printAllUnique(nums);
        
    }

    /**
     * Q1. Second Highest Frequency Element
        Find element with second maximum frequency
        Example:
        [1,2,2,3,3,3,4,4]
        → Output: 2 or 4

     */
    public static int secHighFreq(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int max = 0;
        int secMax = 0;
        for(int i : map.keySet()){
            int num =map.get(i);
            if(num > max){
                secMax = max;
                max = num;
            }
            if(secMax < num && max > num){
                secMax = num;
            }
        }
        return secMax;
    }
    public static int secondHighest(String s) {
        int max = -1 ;
        int secMax = -1 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                if(max < digit){
                    secMax = max;
                    max = digit;
                }
                else if(secMax < digit && max > digit){
                    secMax = digit;
                }
            }
        }
        return secMax;
        
    }/**
    Q2. Frequency Greater Than K
        Print all elements whose frequency is greater than K
        Example:
        arr = [1,1,2,2,2,3], K = 2
        → Output: 2 
        
    */
   public static List<Integer> greaterThanK(int nums[], int k){
    List<Integer> ls = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : nums){
        map.put(i, map.getOrDefault(i,0)+1);
    }
    for(int i : map.keySet()){
        if(map.get(i) > k){
            ls.add(i);
        }
    }
    return ls;
   }

/**
 * Q3. Exactly K Frequency Elements
        Print elements that appear exactly K times
        Example:
        arr = [1,1,2,2,2,3], K = 2
        → Output: 1
 */
    public static void printEqualK(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == k){
                System.out.print(" "+i);
            }
        }
    }
    /**
     * Q4. Elements Appearing Only Once
        Print all unique (non-repeating) elements
        Example:
        arr = [1,1,2,2,2,3]
        → Output: 3
 
    */
    public static void printAllUnique(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                System.out.print(" "+i);
            }
        }
        
    }
    /**
     * Q5. Remove Duplicates from Array
        Return array with only distinct elements
        Example:
        arr = [1,2,2,2,3]
        → Output: [1,3]
     */
      public static HashSet<Integer> removeDuplicates(int nums[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        
        return set;
    }
    /**
     * Q6. Most Frequent Character in String
        Return most frequent character in the string
        Example:
        String str = “apple”
        → Output: ‘a’
     */
    public static char mostFrequent(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char x = 'a';
        for(char ch : map.keySet()){
            int c = map.get(ch);
            
            if(max < c){
                max = c;
                x = ch;
            }
        }
        return x;
    }
    /**
     * Q7. Second Least Frequent Element in an Array
        Return second least frequent element in an array
        Example:
        arr = [1,1,2,2,2,3]
        → Output: 1
     */
       public static char leastFrequent(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min = Integer.MAX_VALUE;
        char x = 'a';
        for(char ch : map.keySet()){
            int c = map.get(ch);
            
            if(min > c){
                min = c;
                x = ch;
            }
        }
        return x;
    }
    /**
     * Q8. Check If String is Pangram
        Contains all characters a–z
        Example:
        String str = “thequickbrownfoxjumpsoverthelazydog”
        → Output: true
     */
    public static boolean isPanagram(String str){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        return set.size() == 26;
    }
    public static boolean isPanagram1(String str){
        int freq[] = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i : freq){
            if(i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPanagram2(String str){
        boolean freq[] = new boolean[26];
        int count = 0 ;
        for(char ch : str.toCharArray()){
            if(!freq[ch - 'a']){
                freq[ch - 'a'] = true;
                count++;
            }
        }
        return count == 26;
    }
}