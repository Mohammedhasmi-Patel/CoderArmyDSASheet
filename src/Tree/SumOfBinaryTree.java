package Tree;

public class SumOfBinaryTree {
    static int sumBT(Node root) {
        // Your code here

        if(root==null){
            return 0;
        }

        return root.data + sumBT(root.left) + sumBT(root.right);
    }

    public static void main(String[] args) {

    }
}
