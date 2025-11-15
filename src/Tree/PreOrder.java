package Tree;

import java.util.ArrayList;

public class PreOrder {
    public static void pre(Node root, ArrayList<Integer> ans)
    {
        if(root==null){
            return;
        }
        // root first , left & right
        ans.add(root.data);
        pre(root.left,ans);
        pre(root.right,ans);
    }

    public static void main(String[] args) {

    }
}
