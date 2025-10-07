// Tree Comstruction and traversal.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree{

    //Tree Structure
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    //Construct Tree
static Node constructTree(int[] arr) {
    Stack<Node> st = new Stack<>();
    Node root = null;

    for (int val : arr) {
        if (val == -1) {
            st.pop();
        } else {
            Node node = new Node(val);
            if (st.isEmpty()) {
                root = node;
            } else {
                Node parent = st.peek();
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            }
            st.push(node);
        }
    }
    return root;
}


    //Print tree elements
    static void printTree(Node root){
        StringBuilder sb = new StringBuilder();
        if(root.left == null && root.right == null) {
            sb.append(root.data);
            System.out.println(sb.toString());
            return;
        }
        if(root.left == null) {
            sb.append(root.data).append("-->").append(root.right.data);
            System.out.println(sb.toString());
            return;
        }else if(root.right == null) {
            sb.append(root.data).append("-->").append(root.left.data);
            System.out.println(sb.toString());
            return;
        }
        sb.append(root.data).append("-->").append(root.left.data).append(", ").append(root.right.data);
        System.out.println(sb.toString());

        printTree(root.left);
        printTree(root.right);
    }

    // Preorder Traversal
static void preorder(Node root) {
    if (root == null) return;

    System.out.print(root.data + " "); // Visit root
    preorder(root.left);               // Visit left subtree
    preorder(root.right);              // Visit right subtree
}
static void inorder(Node root) {
    if (root == null) return;
            preorder(root.left);  

            System.out.print(root.data + " "); 
                 
            preorder(root.right);              
    }
    static void postorder(Node root) {
    if (root == null) return;
            postorder(root.left);       
            postorder(root.right); 
            System.out.print(root.data + " ");              
    }
public static void levelOrder(Node node) {
    if (node == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(node);

    while (!q.isEmpty()) {
        Node child = q.poll();
        System.out.println(child.data);

        if (child.left != null) q.add(child.left);
        if (child.right != null) q.add(child.right);
    }
}

   public static void main(String[] args) {
    int[] arr = {10, 20, 40, -1, 50, -1, -1, 30, 60, -1, -1};
    Node root = constructTree(arr);
    System.out.println("postorder Traversal:");
    levelOrder(root);
}

}