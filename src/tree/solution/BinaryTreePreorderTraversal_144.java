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
public class BinaryTreePreorderTraversal_144 {
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        List<Integer> list = preorderTraversal(bt.root);
        System.out.println(list);
    }
    
    public static  List<Integer> preorderTraversal(BinaryNode<Integer> root) {
        return preorderTraversalHelper(root, new ArrayList<Integer>());
    }
    
    public static  List<Integer> preorderTraversalHelper(BinaryNode<Integer> root,List<Integer> list) {
        if(root == null) return list;
        
        list.add(root.val);
        preorderTraversalHelper(root.left,list);
        preorderTraversalHelper(root.right,list);
        return list;
    }
}