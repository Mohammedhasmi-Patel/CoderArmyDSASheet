package Tree;

public class CountLeafNode {
    int countLeaves(Node root) {
        // Your code

        // base case condition
        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {

    }
}
