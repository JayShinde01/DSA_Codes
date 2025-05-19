public class binary {

    public static void main(String[] args) {
        int arr[]={7,8,1,2,3,3,3,4,5,6};
        int target=10;
        boolean num =  rotated_array2( arr,target);

        System.out.println(num);
    }
    public static int recusive_binary(int []arr,int target,int low,int high){
        
        int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid]<target) {
        return  recusive_binary( arr,target,mid+1,high); 
        }
        else{
             return  recusive_binary( arr,target,low,mid-1);
        }
    }
    public static void ceil_floor(int arr[],int target) {
         int low=0,high=arr.length-1,ceil=0,floor=0;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[mid]==target) {
                ceil=arr[mid];
                floor=arr[mid];
                
            }
            else if(arr[mid]>target){
                high=mid-1;
                ceil=arr[mid];
                floor=arr[mid-1];

            }
            else{
                low=mid+1;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    public static int upper_bound(int arr[],int target){
        int low=0,high=arr.length-1,ans=arr.length;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[mid]<=target) {
                
                ans=mid;
                low=mid+1;

            }
            else{
                high=mid-1;

            }
            
        }
        return ans;

    }
    public static int lower_bound(int arr[],int target){
        int low=0,high=arr.length-1,ans=arr.length;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[mid]>=target) {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;

    }
    public static int rotated_array(int[]arr,int target) {
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
                    if(arr[mid]>= target){
                            if (arr[low]<= target && target<=arr[mid]) {
                            high = mid-1;

                            }
                            else{
                                low=mid+1;
                            }
                        }
                        else{
                            if (arr[mid]<= target && target<=arr[high]) {
                                low=mid+1;

                            }
                            else{
                            high = mid-1;


                            }
                        }
                    }
        return -1;
    }
     public static boolean rotated_array2(int[]arr,int target) {
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return true;
            }
                    if(arr[mid]>= target){
                            if (arr[low]<= target && target<=arr[mid]) {
                            high = mid-1;

                            }
                            else{
                                low=mid+1;
                            }
                        }
                        else{
                            if (arr[mid]<= target && target<=arr[high]) {
                                low=mid+1;

                            }
                            else{
                            high = mid-1;


                            }
                        }
                    }
        return false;
    }

}