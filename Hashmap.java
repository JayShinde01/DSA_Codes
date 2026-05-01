import java.util.*;

public class Hashmap{


    public static void main(String [] args){
HashMap <Student,Integer> map = new HashMap<>();
    Student s = new Student(1,"jay");
    Student s1 = new Student(2,"karan");
    map.put(s,1);
    map.put(s1,1);
    System.out.print(map);
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
        System.out.println("in to string");
        return id+"";
    }

    public int hashCode(){
        System.out.println("in hashcode");
        return id;
    }


    public boolean equals(Object o){
        System.out.println("in equals");
        if(o == this)return true;
        Student s = (Student)o;

        return this.id == s.id ;

    }



}