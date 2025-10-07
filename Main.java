// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
      
        System.out.println(search(arr,0));
    }
public static int search(int[] nums, int target) {
      
        int low=0; int high=nums.length-1;
      while(low<high){
          int mid =(low+high)/2;
          if(nums[mid]==target){
              return mid;
          }
          else if(nums[mid]>target && nums[low]<target){
              high=mid-1;
          }
           else if(nums[mid]<target && nums[high]>target){
              low=mid+1;
          }
      }
      
       return -1;
    }
    

}