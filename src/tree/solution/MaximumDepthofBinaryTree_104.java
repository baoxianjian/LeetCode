/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.solution;

import static tree.solution.ConstructStringfromBinaryTree_606.tree2str;
import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/**
 *
 * @author baoge
 */
public class MaximumDepthofBinaryTree_104 {
    
    public static void main(String[] args)
    {
        BinaryNodeTest();
    }
    
    public static void BinaryNodeTest()
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);

        System.out.println( maxDepth(bt.root));
    }
    
    public static int maxDepth(BinaryNode<Integer> node) {
        if(node == null) return 0;
        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }
    
}
