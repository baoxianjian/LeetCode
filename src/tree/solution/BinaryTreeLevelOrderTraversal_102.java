package tree.solution;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
public class BinaryTreeLevelOrderTraversal_102 {
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
//        bt.insertRoot(1);
//        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
//        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
//        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        
        levelOrder(bt.root);
        
    }
    public static List<List<Integer>> levelOrder(BinaryNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<BinaryNode<Integer>> que = new LinkedList<BinaryNode<Integer>>();
        if(root != null) que.add(root);
        while(!que.isEmpty())
        {
            List<Integer> temp = new ArrayList<Integer>();
            int size = que.size();
            for(int i=0; i<size; i++)
            {
                BinaryNode<Integer> p = que.poll();
                temp.add(p.val);
                if(p.left != null) que.offer(p.left);
                if(p.right != null) que.offer(p.right);
            }
            result.add(temp);
        }
        return result;
    }
}
