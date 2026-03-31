import java.util.*;
public class linked_list {

    public static void main(String[] args) {
       Node n1 = new Node(10,null);
       Node n2 = new Node(20,null);
       Node n3 = new Node(20,null);
       Node n4 = new Node(40,null);
       Node n5 = new Node(50,null);
       Node n6 = new Node(50,null);
       Node n7 = new Node(50,null);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            n6.next = n7;

            printLinkedList(reverseList(removeDuplicates(n1)));

      }

public static Node removeDuplicates(Node head){
    Node prev = null;
    while(head.next != null){
        if(head.data < head.next.data){
            Node newNode = new Node(head.data,null);
            Node temp = prev ;
            prev = newNode;
            prev.next = temp;

        }
        head = head.next;
    }
     Node lastNode = new Node(head.data,prev);
    
   
    return lastNode;

}

public static void printLinkedList(Node head){
    while(head != null){
        System.out.println(head.data);
        head = head.next;
    }
}
public static Node reverseList(Node head){
    Node prev = null;
    while(head != null){
         Node newNode = new Node(head.data,null);
            Node temp = prev ;
            prev = newNode;
            prev.next = temp;

    }
    return prev;
}

public static Node swaping_alternate(Node head) {
    Node prev=null;
    Node temp = head;
    while (temp != null) {
        Node front = temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
    return prev;
}
public static void find_mid(Node head, int mid) {
    if (head.next == null ) {
       
        return;
    }
    if (head.data == mid) {
         System.out.println(head.data);
         return;
    }
    find_mid(head.next,mid);

    
}

public static void find_mid2(Node head) {
    Node slow = head;
    Node fast=head;
    while (fast != null && fast.next !=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println(slow.data);
}

public static int find_count(Node head,int ind,int count) {
    if(head == null){
        return ind;
    }
    count++;
    ind=count/2+1;
    return find_count(head.next, ind, count);  
   
    
}
    public static void print_list(Node head) {
        if(head == null){
            return;
        }
        print_list(head.next);
        System.out.println(head.data);

    }
    public static void add_node(Node head) {
        int index=0;
        while (head != null) {
            if (index == 2) {
            Node seven = new Node(7,null);
            Node temp = head.next;
                head.next=seven;
                seven.next=temp;
            
        }
            index++;
            System.out.println(head.data);
            head=head.next;


        }}
        
 public static void remove_node(Node head) {
        int index=0;
        while (head != null) {
            if (index == 1) {
            Node temp = head.next;
                head.next=head.next.next;
               head.next.next=temp;
            
        }
            index++;
            System.out.println(head.data);
            head=head.next;


        }
        
        

    
}

}



public class Node {
    int data;
    Node next;
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    
}