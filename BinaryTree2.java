// Tree Comstruction and traversal.

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
    
    public static class Pair{
        Node node;
        int state;
        public Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }

    //Construct Tree
    static Node constructTree(Integer[] arr){
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(new Pair(root,1));
        int i = 0;
        while(!st.isEmpty()){
            Pair top = st.peek();

            if(top.state == 1){
                i++;
                if(arr[i] != null){
                    Node left = new Node(arr[i]);
                    top.node.left = left;
                    st.push(new Pair(left,1));
                }
                top.state++;
            }else if(top.state == 2){
                i++;
                if(arr[i] != null){
                    Node right = new Node(arr[i]);
                    top.node.right = right;
                    st.push(new Pair(right,1));
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        return root;
    }

    //Print tree elements
    static void printTree(Node root){
        StringBuilder sb = new StringBuilder();
        if(root.left == null && root.right == null) {
            sb.append(". <-- ").append(root.data).append("--> .");
            System.out.println(sb.toString());
            return;
        }
        else if(root.left == null) {
            sb.append(". <-- ").append(root.data).append("-->").append(root.right.data);
            System.out.println(sb.toString());
            return;
        }else if(root.right == null) {
            sb.append(root.left.data).append("<--").append(root.data).append("--> .");
            System.out.println(sb.toString());
            return;
        }
        
        sb.append(root.left.data).append("<--").append(root.data).append("-->").append(root.right.data);
        System.out.println(sb.toString());

        printTree(root.left);
        printTree(root.right);
    }

    //Size of BT
    // static int size(Node root){
    //     int counter = 1;
    //     if(root.left == null && root.right == null) {
    //         return 1;
    //     }
    //     if(root.left != null) {
    //         int leftcount = size(root.left);
    //         counter += leftcount;
    //     }
    //     if(root.right != null) {
    //         int rightcount = size(root.right);
    //         counter += rightcount;
    //     }
    //     return counter;
    // }

    //Sum of Nodes
    // static int sumOfNodes(Node root){
    //     int counter = root.data;
    //     if(root.left == null && root.right == null) {
    //         return root.data;
    //     }
    //     if(root.left != null) {
    //         int leftcount = sumOfNodes(root.left);
    //         counter += leftcount;
    //     }
    //     if(root.right != null) {
    //         int rightcount = sumOfNodes(root.right);
    //         counter += rightcount;
    //     }
    //     return counter;
    // }

    //Max Node of BT
    // static int maxOfNodes(Node root){
    //     int max = root.data;
    //     if(root.left == null && root.right == null) {
    //         return root.data;
    //     }
    //     if(root.left != null) {
    //         int leftcount = maxOfNodes(root.left);
    //         max = Math.max(leftcount,max);
    //     }
    //     if(root.right != null) {
    //         int rightcount = maxOfNodes(root.right);
    //         max = Math.max(rightcount,max);
    //     }
    //     return max;
    // }

    //Height of Binary Tree
    // static int heigthOfNodes(Node root){
    //     if(root == null) {
    //         return -1;
    //     }
    //     int maxLeft = heigthOfNodes(root.left);
    //     int maxRigth = heigthOfNodes(root.right);
    //     return Math.max(maxLeft,maxRigth)+1;
    // }

    //Preorder Traversal
    // static void preorder(Node root){
    //     if(root == null){
    //         return;
    //     }
    //     System.out.println(root.data);
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    //Inorder traversal
    // static void inorder(Node root){
    //     if(root == null){
    //         return;
    //     }
    //     inorder(root.left);
    //     System.out.println(root.data);
    //     inorder(root.right);
    // }

    //Postorder traversal
    static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }


    public static void main(String[] args){
        // int[] arr = {10,20,40,-1,50,-1,-1,30,60,-1,-1};
        Integer[] arr = {10,20,40,null,null,50,null,null,30,null,60,null,null};
        Node root = constructTree(arr);
        // printTree(root);
        // System.out.println(size(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(maxOfNodes(root));
        // System.out.println(heigthOfNodes(root));
        // preorder(root);
        // inorder(root);
        postorder(root);
    }
}