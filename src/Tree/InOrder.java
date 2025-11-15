package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class InOrder {

    public static void inorder(Node root, ArrayList<Integer> ans)
    {
        // left , root, right

        if(root==null){
            return;
        }

        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }

    public static void main(String[] args) {

    }
}
