import java.util.ArrayList;
public class Charactersubsequences {


    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        String[] arr = { "a","b","c"};
        generatesequence(arr , 0 ,new ArrayList<>());
    }
    static void generatesequence(String[] arr , int ind, ArrayList<String>al){
if (ind == arr.length) {
            System.out.println(al); // base condition
            return;
        }
        al.add(arr[ind]);
        generatesequence(arr, ind+1,al);// pick
        al.remove(al.size()-1);// backtracking
        generatesequence(arr, ind+1,al);// not pick
    }
    
}