public class linked_list {

    public static void main(String[] args) {
        
        Node head = new Node(1,null);
        Node second = new Node(2,null);
            
        Node third = new Node(3,null);
        Node four = new Node(4,null);
            second.next=four;
            third.next =second;


       head.next=third;

       Node temp= swaping_alternate(head);
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }

        // remove_node(head)
;    }
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
        
        

    
}}
