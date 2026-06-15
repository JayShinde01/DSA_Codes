

import java.util.*;

public class Hashset{
    
    public static void main(String[]args){
        int arr[] = {-1,1,0,-3,3};
      System.out.print(Arrays.toString(productExceptSelf(arr)));
    }
   public static int[] productExceptSelf(int[] nums) {
        
        int product = 1;
        for(int i=0;i<nums.length;i++){
            product = product * nums[i];
            if(nums[i] == 0){
                product = 1 ;
                for(int j = 0; j < nums.length;j++){
                    if(nums[j] != 0){
                        product = product * nums[j];
                    }
                }
                for(int j = 0; j < nums.length;j++){
                    if(nums[j] == 0){
                        nums[j] = product;
                    }
                    else{
                        nums[j] = 0;
                    }
                }
                System.err.println(product);
                return nums;
            }
        }
        int ans[] = new int[nums.length];
        int index=0;
        for(int i : nums){
            ans[index++] = product/i;
        }
        return ans;
    }
    public static void stringMethod(){
        HashSet<Student> set = new HashSet<>();
        Student s = new Student(1,"jay");
        Student s3 = new Student(2,"karan");
        
        set.add(s);
      
        set.add(s3);
        System.out.println(set);
        
    }
    public static void listDemo() {
    List<Integer> ls = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
        ls.add(i);
    }

    Iterator<Integer> itr = ls.iterator();

    while (itr.hasNext()) {
        int i = itr.next();
        System.out.println(i);
    }
}

}


class Student{
    int id;
    String name;
     public Student(int id, String name){
        this.id = id;
        this.name = name;
     }
     public String toString(){
        return this.name;
    }
     public boolean equals(Object o){
        System.out.println("in equals");
        if(this == o) return true;
          Student s = (Student) o;                   // casting
        return this.id == s.id && Objects.equals(this.name, s.name);
     }
     public int hashCode(){
        System.out.println("in hashcode");
        int hash = Objects.hash(id,name);
        System.out.println(hash);        
        return hash;
     }
}