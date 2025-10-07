import java.util.*;
public class String_code {
    
    // public static void main (String args[]){
    //     StringBuilder sb = new StringBuilder();
    //     String s="madax";
    //     for (int j = s.length()-1; j >= 0; j--) {
    //     sb.append(s.charAt(j));
            
    //     }
    //   System.out.println( sb);
      
    // }






 // convert case   
    //    public static void main (String args[]){
    //     StringBuilder sb = new StringBuilder();
    //     String s="MaDaM";
    //     for (int j = 0; j < s.length(); j++) {
    //    if (Character.isUpperCase(s.charAt(j))) {
    //     sb.append(Character.toLowerCase(s.charAt(j)));
    //    }else if (!Character.isUpperCase(s.charAt(j))) {
    //     sb.append(Character.toUpperCase(s.charAt(j)));
    //    }
            
    //     }
    //   System.out.println( sb);
      
    // }
    //   public static void main (String args[]){
    //     String s="i am jay";
    //     String arr[]= s.split(" ");
    //     StringBuilder sb1 = new StringBuilder();

    //     for (int j = 0; j < arr.length; j++) {
    //     StringBuilder sb = new StringBuilder();

    //         sb.append(" "+arr[j]);
    //         sb.reverse();
    //         sb1.append(sb);
    // //   System.out.print( sb);

    //     }
        
    //   System.out.println(sb1);
    // }


// //count ocuurence
//  public static void main (String args[]){
//     String n ="Apple";
//     String s = n.toLowerCase();
//     HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
//     for (int key = 0; key < s.length(); key++) {
//        hm.put(s.charAt(key), hm.getOrDefault(s.charAt(key), 0)+1);
        
//     }
//           for (char i  : hm.keySet()) {
//       System.out.println(i+"="+hm.get(i));
            
//           }  
//     }

//Anagram of string
//  public static void main (String args[]){
//     String n ="lpplle";
//     String m = "lpaple";
//     HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
//     if (n.length() != m.length()) {
//                 System.out.println("not anagramm");
//         return;
//     }
//     for (int key = 0; key < m.length(); key++) {
//        hm.put(n.charAt(key), hm.getOrDefault(n.charAt(key), 0)+1);
//        hm.put(m.charAt(key), hm.getOrDefault(m.charAt(key), 0)-1);
//     }
//           for (char i  : hm.keySet()) {
//             if (hm.get(i)!=0) {
//                 System.out.println("not anagramm");
//                 return; 
//             } 
//           }  
//           System.out.println("anagram");
//     }




//remove from 2nd string in first string
//  public static void main(String[] args) {
//     String s="aapple";
//     HashMap <Character,Integer> hs =new HashMap<Character,Integer>();
//     for (int i = 0; i < s.length(); i++) {
//           if (hs.containsKey(s.charAt(i)) ) {
//             System.out.println(s.charAt(i));
//             return;
//         }
//         else{
//         hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);

//         }
      
//     }

//  }

//sstring contains only digit or not
// public static void main(String[] args) {
//     String s= "1234";
//     System.out.println(isdigit(s));
// }
// public static boolean isdigit(String s) {
//     for (int i = 0; i < s.length(); i++) {
//         char ch = s.charAt(i);
//         if (!(ch-'0'>= 0 && ch-'0' <= 9)) {
//             return false;
//         }
//     }
//     return true;
// }



//first letter capital
      public static void main (String args[]){
        String s="i am jay";
        
        String arr[]= s.split(" ");
        StringBuilder sb1 = new StringBuilder();

        for (int j = 0; j < arr.length; j++) {
        StringBuilder sb = new StringBuilder();

            sb.append(" "+Character.toUpperCase(arr[j].
            charAt(0))+arr[j].substring(1));
         
           
            sb1.append(sb);
      System.out.print( sb);

        }

         

        // String str2="EnjoyYourCoffee";
		// StringBuffer sb=new StringBuffer("");
		// int spaces[]={5,9};
		// int index=0;
		// for(int i=0;i<=str2.length()-1;i++){
		//     if(index<spaces.length && i==spaces[index]){
		//         sb.append(" ");
		//         sb.append(str2.charAt(i));
		//         index++;
		//     }
		//     else{
		//         sb.append(str2.charAt(i));
		//     }
		// }
		// System.out.println(sb);
        }
}
