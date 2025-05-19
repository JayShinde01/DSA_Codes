import java.util.HashMap;

public class string {
    public static void main(String[] args) {
        String s = "ztkqug";
        String goal="kqugzt";

        System.out.println(rotated2(s,goal));
    }
     public static boolean rotated2(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        else if ((s+s).contains(goal)) {
            return true;
            
        }
        return false;
     }

    public static boolean rotated(String s, String goal){
        char x=goal.charAt(0);
        int start =0;
            for (int i = 0; i < s.length(); i++) {
                if(x == s.charAt(i)){
                    start=i;
                }
                
            }
                 for (int i = start; i < s.length(); i++) {
                if(s.charAt(i) != goal.charAt(i-start)  ){
                    return false;
                }
                
            }
                 for (int i = 0; i < start; i++) {
                if((s.charAt(i) != goal.charAt(s.length()-start+i))){
                     return false;

                }
                
            }
        return true;

    }
    public static boolean reverse2() {
        HashMap <Character,Integer> hm =new HashMap<>();
        String str1="CAT",str2="Aat";
            if (str1.length() != str2.length()) {
                return false;
            }
        
            for (int i = 0; i < str1.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i),0)+1)  ;      
            }
              for (int i = 0; i < str2.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str2.charAt(i),0)-1) ;       
            }
            for (char key : hm.keySet()) {
                if (hm.get(key) != 0) {
                    return false;
                }
                
            }
            return true;
        
    }
    public static void reverse(String s){
        String rev="",word="";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!rev.equals(" ")) {
                    rev= word+" "+rev;
                word="";
                }
                
            }else{ 
                word +=ch; 

            }
        }
                    rev= word+" "+rev;

        System.out.println(rev);

    }
}
