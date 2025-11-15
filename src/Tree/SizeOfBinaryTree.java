package Tree;

public class SizeOfBinaryTree {
    public static int getSize(Node root) {
        // code here
        if(root==null){
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String[] args) {

    }
}
