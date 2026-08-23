import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueCode {
  
    
    Node head;
    Node tail;
    QueueCode(){
        head = tail = null;
    } 
    void push(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void pop(){
        if(!isEmpty()){
            head = head.next;
        }
    }
    int front(){
        if(!isEmpty()){
           return head.data;
        }
        return -1;
    }
    boolean isEmpty(){
        return tail == null;
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}