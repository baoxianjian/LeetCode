package tree.solution;


import java.util.ArrayList;
import java.util.List;
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
public class BinaryTreePostorderTraversal_145 {
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        List<Integer> list = postorderTraversal(bt.root);
        System.out.println(list);
        
    }
    public static List<Integer> postorderTraversal(BinaryNode<Integer> root) {
        return postorderTraversalHelper(root, new ArrayList<Integer>());
    }
    
    public static List<Integer> postorderTraversalHelper(BinaryNode<Integer> root, List<Integer> list)
    {
        if(root == null) return list;
        
        postorderTraversalHelper(root.left, list);
        postorderTraversalHelper(root.right, list);
        list.add(root.val);
        
        return list;
    }
}
