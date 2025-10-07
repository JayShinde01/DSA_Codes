import java.lang.StringBuilder;

public class keypad {
    public static void main(String[] args) {
        String str = "23";
        String []arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPadCombination(str,arr,0,new StringBuilder());
    }
    public static void keyPadCombination(String str,String []arr,int ind,StringBuilder sb){
           if (ind == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        
        String paryay=arr[str.charAt(ind)-'0'];
        for (int i = 0; i < paryay.length(); i++) {
            char ch = paryay.charAt(i);
                sb.append(ch);
        keyPadCombination(str, arr, ind+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
