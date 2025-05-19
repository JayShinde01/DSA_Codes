public class P_Array {
    public static void main (String []args){
        int  arr[] = new int []{1,2,3,4};
        print_Arr(arr,0,arr.length);  
      }
      public static int print_Arr(int arr[],int s,int e){
        if(s == e){
            return 0;
        }
        System.out.print(arr[s]);
         print_Arr(arr,s+1,e);
        System.out.print(arr[s]);
        return 1;
      }
}
