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
public class SameTree_100 {
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        BinaryTree<Integer> bt2 = new BinaryTree<Integer>();
        bt2.insertRoot(1);
        BinaryNode<Integer> a2 = bt2.insertChild(bt2.root, 2, true);
        BinaryNode<Integer> b2 = bt2.insertChild(bt2.root, 3, false);
        BinaryNode<Integer> c2 = bt2.insertChild(a2, 4, true);
        
        System.out.println(isSameTree(bt.root,bt2.root));
    }
    
    public static boolean isSameTree(BinaryNode p, BinaryNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(q.val != p.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
    }
}
