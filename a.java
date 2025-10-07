import java.util.Arrays;
import java.util.HashSet;

public class a {

    public static void main(String[] args) {
        // String s []= {"flight","flow","flew"};
        // int max =Integer.MIN_VALUE;
        //   for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     int c = ch -'0';
        //     if ( c % 2 != 0 && max < c ) {
        //         max = Math.max(max, c);
        //     }

            
        //   }
        //   System.out.println(max);
        System.out.println(removeDuplicates2("jayanilshinde"));
    }
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs.length;i++){
            for(int j = 0 ;j<strs[i].length();j++){
                if(str.charAt(j) == strs[i].charAt(j)){
        System.out.println(str.charAt(j));

                    sb.append(str.charAt(j));
                }
            }
        }
        
        return sb.toString();
    }
    public static boolean rotateString(String s, String goal) {
        goal += goal;
        if (goal.contains(s)) return true;
        else return false;

    }
   
    public static String removeDuplicates(String str) {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]<ch[i+1]){
                sb.append(ch[i]);
            }
        }
        return sb.append(ch[ch.length-1]).toString();

    }
    public static String removeDuplicates2(String str) {
        HashSet <Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder(); 

        for (int i = 0; i < str.length(); i++) {
           hs.add(str.charAt(i));
        }
       for (Character character : hs) {
        sb.append(character);
       }
       return sb.toString();
    }
}