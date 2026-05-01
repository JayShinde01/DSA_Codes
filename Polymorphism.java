public class Polymorphism{
    public static void main(String[]args){
        xyz x = new xyz();
        x.add(4,2);
        add(4,2);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
   
}
class xyz extends Polymorphism{
    public static void add(int a, int b){
        System.out.println(a-b);
    }
}