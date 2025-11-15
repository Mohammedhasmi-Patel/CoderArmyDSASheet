package Tree;

import java.util.ArrayList;

public class PostOrder {
    public static void post(Node root, ArrayList<Integer> ans)
    {
        if(root==null){
            return;
        }

        // left first
        post(root.left,ans);
        post(root.right,ans);
        ans.add(root.data);


    }

    public static void main(String[] args) {

    }
}
