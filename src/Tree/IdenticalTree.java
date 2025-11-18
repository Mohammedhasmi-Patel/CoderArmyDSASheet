package Tree;

public class IdenticalTree {

    public static boolean isIdentical(Node r1,Node r2)
    {
        if(r1 == null && r2 != null){
            return false;
        }

        if(r2==null && r1 != null){
            return false;
        }
        // base case when both tree are same then pointer is end
        if(r1==r2){
            return true;
        }

        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
    public static void main(String[] args) {

    }
}
