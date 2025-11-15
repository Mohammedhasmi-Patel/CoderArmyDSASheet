package Tree;

public class TotalNonLeafNode {
    public static int getTotalNodes(Node root)
    {
        if(root== null){
            return 0;
        }
        return 1 + getTotalNodes(root.left) + getTotalNodes(root.right);
    }

    public static int getTotalLeaf(Node root )
    {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return getTotalLeaf(root.left) + getTotalLeaf(root.right);
    }

    public static void main(String[] args) {

    }
}
