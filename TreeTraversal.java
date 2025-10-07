import java.util.ArrayList;
import java.util.List;

class Node{
        int data;
        List<Node> children=new ArrayList<>();
        public Node (int data){
            this.data=data;
        }
    }   
        public class TreeTraversal{
            public static void traverse(Node node) {
                System.out.println("node preorder"+node.data);
                for (Node child: node.children) {
                traverse(child);
                System.out.println("edge postorder " + node.data + " " + child.data);
                }
                System.out.println("node postorder " + node.data);

            }
 public static void preorder(Node node) {
  

    System.out.print(node.data + " "); 
    for (Node child : node.children) {
        preorder(child);
    }
}
public static void deleteLeafNode(Node node) {
    for (int i = node.children.size() - 1; i >= 0; i--) {
        Node child = node.children.get(i);
        if (child.children.size() == 0) { // it's a leaf
            node.children.remove(i);
        } else {
            deleteLeafNode(child);
        }
    }
}
 public static boolean isExist(Node node) {
  if(node.data==100)return true;
    System.out.println(node.data);
    for (Node child : node.children) {
  if(child.data==100)return true;
    

        isExist(child);
        
    }
    return false;
}


    public static void main(String[] args) {
       
        Node root = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(100);
        Node node4 = new Node(50);
        Node node5 = new Node(60);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);

        // traverse(root);
        // preorder(root);
        System.out.println(isExist(root));
    }
}