// Tree Construction and traversal.

import java.util.ArrayList;
import java.util.Stack;

class GenericTree{

    //Tree Structure
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int data){
            this.data = data;
        }
    }

    //Construct Tree
    static Node constructTree(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node node = new Node(arr[i]);
                if(st.isEmpty()){
                    root = node;
                }else{
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }
        return root;
    }

    //Print tree elements
    static void printTree(Node root){
        StringBuilder sb = new StringBuilder();
        sb.append(root.data).append(" --> ");
        for(Node child:root.children){
            sb.append(child.data).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()).append(".");
        System.out.println(sb.toString());

        for(Node child:root.children){
            printTree(child);
        }
    }

    //counting number of nodes in tree
    // static int countNode(Node root,int count){
    //     count++;
    //     for(Node child:root.children){
    //         count = countNode(child,count);
    //     }
    //     return count;
    // }

    // static int countNode(Node root){
    //     int count = 1;
    //     // if(root.children.isEmpty()){
    //     //     return 1;
    //     // }
    //     for(Node child:root.children){
    //         count += countNode(child);
    //     }
    //     return count;
    // }

    // Max sized node
    // static int maxNode(Node root,int max){
    //     max = Math.max(max,root.data);
    //     for(Node child:root.children){
    //         max = maxNode(child,max);
    //     }
    //     return max;
    // }

    //Height of Tree
    // static int height = 0;
    // static void heightOfTree(Node root, int count){
    //     if(root.children.isEmpty()){
    //         height = Math.max(height,count);
    //     }
    //     for(Node child:root.children){
    //         heightOfTree(child,count++);
    //     }
    // }

    //preOrder Traversal
    // static void preOrder(Node root){
    //     System.out.println(root.data);
    //     for(Node child:root.children){
    //         preOrder(child);
    //     }
    // }

    //PostOrder Traversal
    // static void postOrder(Node root){
    //     for(Node child:root.children){
    //         postOrder(child);
    //     }
    //     System.out.println(root.data);
    // }

    //CombinedOrder Traversal
    // static void cominedOrder(Node root){
    //     System.out.println("Node Preorder:"+root.data);
    //     for(Node child:root.children){
    //         System.out.println("Edge Preorder:"+root.data+"-->"+child.data);
    //         cominedOrder(child);
    //         System.out.println("Edge Postorder:"+child.data+"-->"+root.data);
    //     }
    //     System.out.println("Node Postorder:"+root.data);
    // }


    //LevelOrder Travarsal
    //static void levelOrder(Node root){
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
    //     while(!queue.isEmpty()){
    //         for (int i = 0; i < queue.size(); i++) {
    //             Node node = queue.poll();
    //             System.out.println(node.data);
    //             for (Node child : node.children) {
    //                 queue.add(child);
    //             }
    //         }
    //     }
    // }

    //ZigzagOrder Travarsal
    // static void zigzagOrder(Node root){
    //     Stack<Node> current = new Stack<>();
    //     Stack<Node> nextNodes = new Stack<>();
    //     boolean dir = true;
    //     current.push(root);
    //     while(!current.isEmpty()){
    //         Node node = current.pop();
    //         System.out.println(node.data);
    //         if(dir){
    //             for(Node child:node.children){
    //                 nextNodes.push(child);
    //             }
    //         }else{
    //             for(int i = node.children.size()-1; i >= 0; i--){
    //                 nextNodes.push(node.children.get(i));
    //             }
    //         }
    //         if(current.isEmpty()){
    //             Stack<Node> temp = current;
    //             current = nextNodes;
    //             nextNodes = temp;
    //             dir = !dir;
    //         }
    //     }
    // }


    //Mirror Tree
    // public static void mirrorTree(Node root){
    //     ArrayList<Node> temp = new ArrayList<>();
    //     for(Node child:root.children){
    //         mirrorTree(child);
    //     }
    //     for(int i = root.children.size()-1; i >= 0; i--){
    //         temp.add(root.children.get(i));
    //     }
    //     root.children = temp;
    // }


    //Remove all leaf nodes from tree
    // static void removeAllLeaf(Node root){
    //     for(int i = root.children.size()-1; i >= 0; i--){
    //         if(root.children.get(i).children.isEmpty()){
    //             root.children.remove(root.children.get(i));
    //             continue;
    //         }
    //         removeAllLeaf(root.children.get(i));
    //     }
    // }

    //Check if value exist
    // static boolean isExist(Node root, int target){
    //     if(root.data == target){
    //         return true;
    //     }
    //     for(Node child:root.children){
    //         if(isExist(child,target)) return true;
    //     }
    //     return false;
    // }


    //Node to root path
    static ArrayList<Integer> nodeToRoot(Node root,int target,ArrayList<Integer> al){
        if(root.data == target){
            al.add(root.data);
            return al;
        }
        for(Node child:root.children){
            if(!nodeToRoot(child,target,al).isEmpty()){
                al.add(root.data); 
                return al;
            }
        }
        return al;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 
 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 
 40, 100, -1, -1, -1};

        Node root = constructTree(arr);

        // printTree(root);

        // countNode(root);
        // System.out.println(count);

        // System.out.println(countNode(root));

        // System.out.println(maxNode(root,0));

        // System.out.println(heightOfTree(root)-1);

        // heightOfTree(root,0);
        // System.out.println(height);

        // cominedOrder(root);

        // levelOrder(root);

        // zigzagOrder(root);

        // mirrorTree(root);
        // printTree(root);

        // printTree(root);
        // removeAllLeaf(root);
        printTree(root);

        // System.out.println( isExist(root,30));

        System.out.println(nodeToRoot(root,110, new ArrayList<>()));
    }
}