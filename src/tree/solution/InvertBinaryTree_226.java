/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.solution;

import tree.utils.BinaryNode;
import tree.utils.BinaryTree;

/**
 *
 * @author baoge
 */
public class InvertBinaryTree_226 {
   
    public static void main(String[] args)
    {
        invertTreeTest();
    }
    
    public static void invertTreeTest()
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
//        BinaryNode<Integer> d = bt.insertChild(b, 5, true);
//        bt.insertChild(b, 6, false); 
//        bt.insertChild(c, 8, true);
//        bt.insertChild(d, 9, true);
        
        BinaryNode<Integer>  newNode = invertTree(bt.root);
        BinaryTree<Integer> btResult = new BinaryTree<Integer>();
        btResult.root=newNode;
        btResult.preOrder();
        
    }
    
    public static BinaryNode<Integer> invertTree(BinaryNode<Integer> node) {
        if(node == null) return null;
        
        BinaryNode<Integer> newNode = new  BinaryNode<Integer>(node.val);
        
        newNode.left = invertTree(node.right);
        newNode.right = invertTree(node.left);
        
        return newNode;
    }
    
}
