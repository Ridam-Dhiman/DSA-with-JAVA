import java.util.*;

class Binary_Tree{
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        preorder(root);
    }

    public static void preorder(Node n){
        if(n == null) return;
        System.out.println(n.data);
        preorder(n.left);
        preorder(n.right);
    }

    public static void preOrderIterative(Node r){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = r;
        st.push(node);
        while(! st.isEmpty()){
            node = st.pop();
            ans.add(node.data);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        System.out.println(ans);
    }

    public static void inorder(Node n){
        if(n == null) return;
        inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
    }

    public static void inorderIterative(Node r){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = r;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                ans.add(node.data);
                node = node.right;
            }
        }
        System.out.println(ans);
    }

    public static void postorder(Node n){
        if(n == null) return;
        postorder(n.left);
        postorder(n.right);
        System.out.println(n.data);
    }

    public static void postOrderIterative_2Stack(Node r){
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node node = r;
        st1.push(node);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.push(node);
            if(node.left != null) st1.push(node.left);
            if(node.right != null) st1.push(node.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
        System.out.println(ans);
    }

    public static void postOrderIterative_1Stack(Node r){
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node cur = r;
        Node temp = null;
        while(cur != null || !st.isEmpty()){
            if(cur != null){
                st.push(cur);
                cur = cur.left;
            }else{
                temp = st.peek().right;
                if(temp == null){
                    temp = st.pop();
                    ans.add(temp.data);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        ans.add(temp.data);
                    }
                }else{
                    cur = temp;
                }
            }
        }
        System.out.println(ans);
    }
 
    public static void levelOrder(Node n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node nd = q.poll();
                level.add(nd.data);
                if(nd.left != null) q.add(nd.left);
                if(nd.right != null) q.add(nd.right);
            }
            ans.add(level);
        }
        for (List<Integer> lvl : ans) {
            System.out.println(lvl);
        }
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data = key;
        left = null;
        right = null;
    }
}