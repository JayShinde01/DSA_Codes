class List{
    Node head;
    Node tail;

    public List() {
        head = tail = null;
    }
    void pushFront(int val){
        Node newNode = new Node(val,null);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void pushBack(int val){
        Node newNode = new Node(val,null);
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    
     void popFront(){
        if(head == null){
            return;
        }
       head = head.next;
        
    }
     void popBack(){
        if(tail == null){
            return;
        }
        Node temp = head ;
       while (temp != null) { 
           if(temp.next == tail){
                tail = temp;
                temp.next = null;
                return;
           }
           temp = temp.next;

       }
        
    }
    void insert(int data, int position){
        if(position == 0){
            Node newNode = new Node(data,head);
            head = newNode;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            
            if(count + 1 == position){
                Node newNode = new Node(data,temp.next);                                        
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            count++;
        }
    }
    void reverse(){
        Node temp = head;
        Node next = null;
        Node prev = null;
        while (temp != null) { 
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
public static void main(String[] args) {
    System.out.println("in list class.");
        List ls = new List();
        ls.pushFront(1);
        ls.pushFront(2);
        ls.pushFront(3);
        ls.pushBack(4);
        ls.pushBack(5);
        ls.pushBack(6);
        ls.printList();
     
      
        System.out.println();
       
        ls.insert(10, 0);
        ls.printList();
        ls.reverse();
        System.out.println();
        ls.printList();
        
    }
    
}



class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}