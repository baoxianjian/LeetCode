/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.solution;

import static tree.solution.InvertBinaryTree_226.invertTree;
import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/**
 *
 * @author baoge
 */
public class SumofLeftLeaves_404 {
    
    public static void main(String[] args)
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        BinaryNode<Integer> d = bt.insertChild(b, 5, true);
        bt.insertChild(b, 6, false); 
//        bt.insertChild(c, 8, true);
//        bt.insertChild(d, 9, true);
        
        System.out.println(sumOfLeftLeaves2(bt.root));
    }
    
    public static int sumOfLeftLeaves(BinaryNode<Integer> node)
    {
        if(node == null) return 0;
        
        int val = 0;
        
        if(node.left !=null) 
        {
            if(node.left.left == null && node.left.right==null)
            {
                val = node.left.val;
            }
            else
            {
                val += sumOfLeftLeaves(node.left);
            }
        }
        
        if(node.right != null)
        {
            val += sumOfLeftLeaves(node.right);
        }
        
        return val;
    }
    
    public static int sumOfLeftLeaves2(BinaryNode<Integer> node)
    {
        if(node == null) return 0;
        int val = 0;
        
        if(node.left !=null) 
        {
            //左子树下面 确定为叶子节点
            if(node.left.left == null && node.left.right==null)
                val = node.left.val;
            else
                val = sumOfLeftLeaves(node.left); //一个左子树 只需要一个最终数字 无需累加
        }
        
        val += sumOfLeftLeaves(node.right);
        return val;
    }
}
