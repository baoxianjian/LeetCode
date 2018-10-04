/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.solution;

import java.util.List;
import static tree.solution.BinaryTreePostorderTraversal_145.postorderTraversal;
import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/**
 *
 * @author baoge
 */
public class TwoSumIVInputisaBST_653 {
    public static void  main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(5);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 3, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 6, false);
        BinaryNode<Integer> c = bt.insertChild(a, 2, true);
        BinaryNode<Integer> d = bt.insertChild(a, 4, false);
        BinaryNode<Integer> e = bt.insertChild(b, 7, false);
        
        findTarget(bt.root, 100);
        
//        bt.inOrderTraverse();
//        List<Integer> list = bt.inOrderTraverse();
//        System.out.println(list);
    }
    
    public static boolean findTarget(BinaryNode<Integer> root, int k) {
        if(root == null) return false;
        findTarget(root.left, k);
        System.out.println(root.val);
        findTarget(root.right, k);
     return false;   
    }
}
