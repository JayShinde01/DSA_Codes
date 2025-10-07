import java.util.HashMap;
import java.util.Scanner;
class Questions{

public static void main(String[] args) {


    // String s = "sihT si terces";
    //  reverse(s);
    formater("8767258243");
                
}

public static String abbrevation(String s){

    StringBuilder sb = new StringBuilder();
    sb.append(s.trim().substring(0, 1)+".");
    String arr [] = s.trim().split(" ");
    sb.append(" "+arr[1]);

    System.out.println(sb);
        
return sb.toString();
    
   
}

public static String formater(String s){

    StringBuilder sb = new StringBuilder(s);
    sb.insert(0, "(");
    sb.insert(4, ") ");
    sb.insert(9, "-");
        System.out.println(sb);
return sb.toString();
    
   
}
public static void removeBadWords(String s){
    String word = "dumb";  
    StringBuilder sb = new StringBuilder(s);
    

    int start = s.toLowerCase().indexOf(word.toLowerCase());
    
    if(start != -1){  
        int end = start + word.length(); 
       for(int i = start; i < end; i++){
            sb.setCharAt(i, '*'); 
        }
        
    }
    
    System.out.println(sb.toString());
}

public static void reverse(String s){
    StringBuilder sb = new StringBuilder();
     String arr[] = s.split(" ");
    for (int i = 0; i < arr.length; i++) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(arr[i]);
        sb.append(" "+sb1.reverse());
    }
    System.out.println(sb.toString().trim());
}




//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int votes = sc.nextInt();
//         int arr[]=new int[votes];
//         for(int i = 0; i< votes ; i++){
//            arr[i] = sc.nextInt();
//         }
//         System.out.println(winner(arr));
//     }
//  public static int winner(int[] arr) {
//     HashMap<Integer, Integer> hm = new HashMap<>();
//     int votes = 0;          
//     int max = Integer.MAX_VALUE;  
//     for (int id : arr) {
//         hm.put(id, hm.getOrDefault(id, 0) + 1);

        
//         if (hm.get(id) > votes || (hm.get(id) == votes && id < max)) {
//             votes = hm.get(id);
//             max = id;
//         }
//     }

//     return max;
// }

// }





    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int seats = sc.nextInt();
    //     int arr[]=new int[seats];
    //     for(int i = 0; i< seats ; i++){
    //        arr[i] = sc.nextInt();
    //     }
    //     System.out.println(longest(arr));
    // }
   
    // public static int longest(int arr[]) {
        
    //     int max = 0, count = 0;
    //     for (int seat : arr) {
    //         if (seat == 0) {   
    //             count++;
    //             max = Math.max(max, count);
    //         } else {           
    //             count = 0;
    //         }
            
    //     }

    //     return max;
    // }

//}
}