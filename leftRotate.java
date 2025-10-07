public class leftRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int output[]=rotateByK(arr,2);
        for (int i : output) {
            System.out.print(i);
        }
    }
    // public static int[]rotate(int arr[]){
    //     int temp =arr[0];
    //     for (int i = 0; i < arr.length-1; i++) {
    //         arr[i]=arr[i+1];

    //     }
    //     arr[arr.length -1]=temp;
    //     return arr;
    // }
  public static int[]rotateByK(int arr[],int k){
        
       int temp[]=new int [arr.length];
        for (int i = k; i < arr.length ; i++) {
          temp[i-k]=arr[i];
        }
            for (int i = 0; i < k; i++) {
        temp[n - k + i] = arr[i];
    }

    
        return temp;
    }

}
