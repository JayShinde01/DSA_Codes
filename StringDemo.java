
import java.util.Objects;

class StringDemo{
    public static void main(String[] args) {
        Float y =  10.20f;
         Integer x =10;
            System.out.println(x.hashCode());
        // String s1 = "pune";
        // String s2 = new String("pune");
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        // System.out.println(System.identityHashCode(s1));
        // System.out.println(System.identityHashCode(s2));
    }

   
}
class Main{
   
     public boolean equals(Object o){
        System.out.println("in equals");
       
        return true;
     }
     public int hashCode(){
        System.out.println("in hashcode");
        int hash = Objects.hash();
        System.out.println(hash);        
        return 1;
     }
}