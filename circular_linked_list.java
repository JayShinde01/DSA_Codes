public class circular_linked_list {
    public static void main(String[] args) {
         Node head = new Node(1,null);
        Node second = new Node(2,null); 
        Node third = new Node(1,null);
        Node four = new Node(2,null);
        Node five = new Node(1,null);
        head.next= second;
        second.next=third;
        third.next=four;
        four.next=five;
        five.next=null;
        // System.out.println(circular_node(head).data);
        // System.out.println(is_palindrom(head));
        remove_mid(head);
        
    }
    public static boolean is_palindrom(Node head ){
        Node slow=head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node temp = head;
        while (temp != slow) {
            Node front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        while (prev != null) {
            System.out.println(prev.data);
            prev=prev.next;
        }
        while (temp != null) {
            if(temp.next != prev){
                System.out.println(temp.data);
                System.out.println(prev.data);
                return false;
            }
            temp =temp.next;
            prev = prev.next;
        }

        return true;
    }
    public static void remove_mid(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while (fast != null && fast.next != null) {
            prev=slow;

            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(prev.data);
        // System.out.println(slow.data);

        prev.next=slow.next;
        slow.next=null;
        while (head != null) {
            System.out.println(head.data);
            head=head.next;
        }

    }
    public static Node circular_node(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                    slow=head;
                while (slow != fast) {
                    if(slow==fast){
                        System.out.println("inner");
                        return slow;
                    }
                    slow=slow.next;
                    fast=fast.next;
                }
                        System.out.println("mid");

                return slow;
            }
        }
                        System.out.println("end");

        return null;
    }
    public static boolean is_circular(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
