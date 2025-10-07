public class sorting {
        public static void main(String[] args) {
            int arr[] = {34, 12, 56, 45, 23};
            bubbleSort(arr);
        }
// 3. Insertion Sort Question (Dry run every input)
public static void insertionSort(int arr[], int n)
{
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
//2. Bubble Sort Question (Dry run every input)
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                  
                  
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                  for (int i : arr) {
        System.out.println(i);
    }
    }

// 1. Selection Sort Question (Dry run every input)
public static void selection(int arr[]) {
        int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int min_idx = i;

        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {

                min_idx = j; 
            }
        }

                int temp =arr[i];
               arr[i]=arr[min_idx];
                arr[min_idx]=temp;
        
    }
    for (int i : arr) {
        System.out.println(i);
    }
            
        }
        public static void swap(int num1,int num2) {
                int temp =num1;
             num1=num2;
                num2=temp;
        }
}
