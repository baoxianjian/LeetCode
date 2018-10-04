/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.solution;

import static tree.solution.Main.findBottomLeftValue;
import tree.utils.BinaryNode;
import tree.utils.BinaryTree;


/**
 *
 * @author baoge
 */
public class ConstructStringfromBinaryTree_606 {
    public static void main(String[] args)
    {
        tree2strTest();
    }
    
    public static String tree2str(BinaryNode<Integer> node) {
        if(node == null) return "";
        
        String val = node.val+"";
        String leftVal = tree2str(node.left);
        String rightVal = tree2str(node.right);
        
        if(!leftVal.equals("") && !rightVal.equals("")) return val+"("+leftVal+")"+"("+rightVal+")";
        if(!leftVal.equals(""))  return val+"("+leftVal+")";
        if(!rightVal.equals(""))  return val+"()("+rightVal+")";
        return val;
    }
    
    
    public static void tree2strTest()
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);

        System.out.println( tree2str(bt.root));
    }
    
}