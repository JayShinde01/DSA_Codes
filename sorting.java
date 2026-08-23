public class sorting {
        public static void main(String[] args) {
            int arr[] = {34, 12, 56, 45, 23};
            selectionSort(arr);
            for(int i : arr){
                System.out.print(" "+i);
            }
        }

// 3. Insertion Sort Question (Dry run every input)

//2. Bubble Sort Question (Dry run every input)
  public static void bubbleSort(int arr[]){
    for(int i = 0 ; i < arr.length - 1 ; i++){
        for(int j = 0 ; j < arr.length - i -1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
  }

// 1. Selection Sort Question (Dry run every input)
    public static void selectionSort(int arr[]){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int sIndex = i;
            for(int j = i+1; j < arr.length ; j++) {
                if(arr[sIndex] > arr[j]){
                    sIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[sIndex];
            arr[sIndex] = temp;

        }
    }
    public static void swap(int num1,int num2) {
                int temp =num1;
                num1=num2;
                num2=temp;
    }
}
