package tree.solution;


import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class PathSum_112 {
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        System.out.println(hasPathSum(bt.root,7));
    }
    
    public static boolean hasPathSum(BinaryNode<Integer> root, int sum) {
        if(root == null) return false;
        sum-=root.val;
        if(root.left == null && root.right == null) 
        {
            return sum == 0;
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right, sum); //用或分担 同样的sum
    }

    
    
}
