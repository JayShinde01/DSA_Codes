// import java.util.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class string {

    public static void main(String[] args) {
String s = "leeeeetcoooodeee";
       System.out.println(DeleteThreeSame(s));
    }
    
//     //2. Minimum Number of Operations to Move All Balls to Each box


// // 13. Delete Characters to Make Fancy String
// public static String Fancy_String(String s) {
//     String newStr="";
//     for (int i = 0; i < s.length(); i++) {
//         int len = newStr.length();
        
//         if (len >= 2 && newStr.charAt(len - 1) == s.charAt(i) && newStr.charAt(len - 2) == s.charAt(i)) {
//             continue;
//         }

//         newStr += s.charAt(i);
//     }
//     return newStr;
// }
// //15. Corporate Flight Bookings
// public static int []Bookings() {
//     int[] prefix = new int[n];

//         for(int i=0; i<bookings.length; i++){
//             for(int j=bookings[i][0]-1; j<=bookings[i][1]-1; j++){
//                 prefix[j] += bookings[i][2];
//             }
//         }

//         return prefix;
// }

//     //12. Find Common Characters
// //      public static String Common_Characters(String[] words) {
// //     String newStr="";
        
    

// //     for (int i = 0; i <words.length; i++) {
// //         for (int j = i+1; j < words.length; j++) {
// //             for (int k = 0; k < words[j].length(); k++) {
// //                 words[i].charAt(i) == words[j].charAt(k);
// //             }
// //     }
        
// //     }

// //     return newStr;
// // }
//     // 11. Remove Trailing Zeros From a String
//     public static String Remove_Zeros(String sentence) {
//     String newStr="";
        

//     for (int i = 0; i <sentence.length()-1; i++) {
//         if (sentence.charAt(i) != 0 && sentence.charAt(i+1) != 0  ) {
//             newStr =newStr+sentence.charAt(i);
//         }
        
//     }

//     return newStr;
// }
// public static String Remove_Zeros2(String sentence) {
//     int i = sentence.length() - 1;

//     while (i >= 0 && sentence.charAt(i) == '0') {
//         i--;
//     }

//     return sentence.substring(0, i + 1);
// }

//     // 10. Determine if String Halves Are Alike
//     public static boolean Alike(String s) {
//     int mid = s.length() / 2;
//     int count1 = 0, count2 = 0;

//     for (int i = 0; i < mid; i++) {
//         if (isVowel(s.charAt(i))) count1++;
//     }
//     for (int i = mid; i < s.length(); i++) {
//         if (isVowel(s.charAt(i))) count2++;
//     }

//     return count1 == count2;
// }

// public static boolean isVowel(char c) {
//     return "aeiouAEIOU".indexOf(c) != -1;
// }

//     // 9. Number of Strings That Appear as Substrings in Word
// public static int Substrings(String []words,String word) {
//     int count=0;

//  for (int i = 0; i < word.length(); i++) {
//             for (int j = 0; j < words[i].length(); j++) {
//                 if (words[i].charAt(j) == word.charAt(i)) {
//                     count++;
//                     break;
//                 }
//             }
//         }
    
//     return count;
// }



////18.Delete Characters to Make Fancy String
// Input: s = "leeetcode" 
// Output: "leetcode" 
// Explanation: 
// Remove an 'e' from the first group of 'e's to create "leetcode". 
// No three consecutive characters are equal, so return "leetcode".
public static String DeleteThreeSame(String s){
    StringBuilder ans = new StringBuilder(s);
        int x = 0;
    int count=1;
    for (int i = 1; i < s.length(); i++) {
        char ch =s.charAt(i);
        char ch1 =s.charAt(i-1);
        if(ch == ch1) count++;
        else count=1;
        if (count>2) {
            ans.deleteCharAt(i-x);
            x++;
        }
    }
    return ans.toString();
}




//17.Sort Characters By Frequency


//  public static HashMap<Character,Integer> frequencySort(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//         char ch = s.charAt(i);
//         map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//       System.out.println(map.keySet());
       
//         return map;
//     }

////16. take input (3,4)
//[1,2,3] [1,2,3,4]
//[1,1],[1,3],[2,2],[2,4],[3,1],[3,3] => 6
public static int abc(int mike,int jake){
    int count = 0;
    for (int i = 1; i <= mike; i++) {
        for (int j = 1; j <= jake; j++) {
            if ((i+j)%2 == 0) {
                count++;
            }
        }
    }
    return count;
}


// //15.valid parenthesis
// Input: s = "(()())(())"
// Output: "()()()"
    public static String validParenthesis(String s){
        StringBuilder ans = new StringBuilder();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
                count++;
            }
            else{
                count--; 
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
               
            }
        }
        return ans.toString();
    }



////14. Find Common Characters
// Input: words = ["bella","label","roller"] 
// Output: ["e","l","l"]
    // public static ArrayList<Character> findCommonCharacter(String arr[]){
    //     ArrayList<Character> al = new ArrayList<>();
    //     int min=Integer.MAX_VALUE;
    //     int index=-1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i].length() < min) {
    //             min=arr[i].length();
    //             index=i;
    //         }
    //     }
    //     for (int j = 0; j < arr.length; j++) {
    //         boolean flag=false;
    //         int 
    //         for(int i=0;i<arr.length;i++){
    //             for (int k = 0; k < arr[i].length(); k++) {
    //                 if (arr[index].charAt(k) == arr[i].charAt(k)) {
    //                     flag=true;break;
    //                 }
    //             }
    //         }
    //         if (flag) {
                
    //         }
    //     }
      

    //     return al;
    // }


//// 13. Remove Trailing Zeros From a String
// Input: num = "51230100" 
// Output: "512301" 
// Explanation: Integer "51230100" has 2 trailing zeros, remove them and return "512301".
    public static String removeZeros(String s){
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) != '0') {
                return s.substring(0, i+1);
            }
        }
        return s;
    }




////12.Determine if String Halves Are Alike
//Input: s = "book" 
// Output: true 
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

    public static boolean isHalvesAlike(String s){
       if (vowelCount(s.substring(0, s.length()/2)) != vowelCount(s.substring(s.length()/2, s.length()))) return false;
        return true;
    }
    public static int vowelCount(String s){
            int count=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (
                ch == 'a' ||
                ch == 'e'||
                ch == 'i'||
                ch == 'o'||
                ch == 'u'
                ) 
                {
                count++;
            }
        }
        return count;
    }




////11.Number of Strings That Appear as Substrings in Word
    public static int countSubStrings(String s[],String word){
        int count =0;
        for(int i= 0; i< s.length;i++){
           if (word.contains(s[i])) {
                count++;
           }
        }
        return count;
    }







///10.remove consequences from digit(using String builder)
//input:112211
//output:121
public static String removeConsequencesDuplicates2(int num) {
     String s = Integer.toString(num);
     StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length()-1; i++) {
        if (s.charAt(i) != s.charAt(i+1)) {
            sb.append(s.charAt(i));
        }
    }
    sb.append(s.charAt(s.length()-1));
    return sb.toString();
}



////9.remove consequences from digit
//input:112211
//output:121
public static void removeConsequencesDuplicates(int num) {
    int arr[]= new int[digitsCount(num)];
    int i=arr.length-1;
    while (num > 0) {
       arr[i]=num %10;
       i--;
        num /= 10;
    }
    for (int j = 0; j < arr.length-1; j++) {
        if (arr[j]!=arr[j+1]) {
         System.out.print(arr[j]); 
        }
    }
    System.out.println(arr[arr.length-1]);   
}
public static int digitsCount(int num){
    int count=0;
    while(num > 0){
        count++;
        num=num/10;
    }
    return count;
}



//// 8. Reverse Words in a String
//Input: s = "Let's take LeetCode contest" 
// Output: "s'teL ekat edoCteeL tsetnoc"
   public static String reverseWords(String s){
    StringBuilder sb = new StringBuilder();
    String arr[] = s.split(" +");
    for (int i = 0; i < arr.length; i++) {
        for (int j = arr[i].length()-1; j >=0 ; j--) {
            sb.append(arr[i].charAt(j));
        }
        sb.append(" ");
    }
    return sb.toString().trim();
   }
  


//// 7. Check if the Sentence Is Pangram
/// Input: sentence = "thequickbrownfoxjumpsoverthelazydog" 
// Output: true 
// Explanation: sentence contains at least one of every letter of the English alphabet.
     public static boolean Pangram(String s){
        if (s.length() < 26) return false;
        HashSet <Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            if(index >= 0 && index <=26){
                hs.add(s.charAt(i));
            }
        }
        if (hs.size() != 26) return false;   
        return true;
     }







//// 6. Find First Palindromic String in the Array
//  Input: words = ["abc","car","ada","racecar","cool"] 
//Output: "ada" 
public static String first_palindrome(String[] words) {
    for (String word : words) {
        if (isPalindrome(word)) {
            return word;
        }
    }
    return ""; 
}
public static boolean isPalindrome(String word) {
    int start = 0, end=word.length()-1; 
    while(start < end){
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}



//// 5. Truncate Sentence
    public static String truncate(String s,int k){
        String arr[] = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= k; i++) {
            ans.append(" "+arr[i]);
        }
        return ans.toString().trim();
    }


   

////4. Maximum Number of Words Found in Sentences
    public static int maxWords(String[] sentences) {
            int max = 0;

            for (String sentence : sentences) {
                String[] words = sentence.split(" ");
                max = Math.max(max, words.length);
            }

            return max;
        }



////3. Jewels and Stones  
// Input: jewels = "aA", stones = "aAAbbbb" 
// Output: 3
    public static int jewels(String jewels,String stones){
        int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i)==stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }





///2.minimun moves ball
//  Input: boxes = "110" 
// Output: [1,1,3] 
    public static int[] minimumMoves(String str){
            int ans[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int count = 0 ;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='1'){
                    count += Math.abs(i-j);
                }
            }
            ans[i]=count;

        }
        return  ans;
    }





//// 1. Score of a String
//  Input: s = "hello" 
// Output: 13 
    public static int scoreString(String str){
        int score =0 ;
        for (int i = 0; i < str.length()-1; i++) {
            score = score + Math.abs(str.charAt(i)-str.charAt(i+1));
        }
        return score;
    }



   
}


