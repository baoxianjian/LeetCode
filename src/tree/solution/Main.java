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
public class Main {
    
    public static void main(String[] args)
    {
        //mergeTreesTest();
        //findBottomLeftValueTest();
    }
    
    public static void findBottomLeftValueTest()
    {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertRoot(1);
        BinaryNode<Integer> a = bt.insertChild(bt.root, 2, true);
        BinaryNode<Integer> b = bt.insertChild(bt.root, 3, false);
        BinaryNode<Integer> c = bt.insertChild(a, 4, true);
        BinaryNode<Integer> d = bt.insertChild(b, 5, true);
        bt.insertChild(b, 6, false); 
        bt.insertChild(c, 8, true);
        bt.insertChild(d, 9, true);
        
        //bt.preOrder();
//        int max = bt.findMaxLeft(bt.root);
//        System.out.println(max);
        
        int bottomLeft = findBottomLeftValue(bt.root);
        System.out.println(bottomLeft);
    }
    
    public static void mergeTreesTest()
    {
        BinaryTree<Integer> bt1 = new BinaryTree<Integer>();
        bt1.insertRoot(1);
        BinaryNode<Integer> a1 = bt1.insertChild(bt1.root, 2, true);
        BinaryNode<Integer> b1 = bt1.insertChild(bt1.root, 3, false);
        BinaryNode<Integer> c1 = bt1.insertChild(a1, 4, true);
        BinaryNode<Integer> d1 = bt1.insertChild(b1, 5, true);
        bt1.insertChild(b1, 6, false); 
//        bt1.insertChild(c1, 8, true);
//        bt1.insertChild(d1, 9, true);
        
        
        BinaryTree<Integer> bt2 = new BinaryTree<Integer>();
        bt2.insertRoot(10);
        BinaryNode<Integer> a2 = bt2.insertChild(bt2.root, 2, true);
        BinaryNode<Integer> b2 = bt2.insertChild(bt2.root, 3, false);
        BinaryNode<Integer> c2 = bt2.insertChild(a2, 4, true);
        BinaryNode<Integer> d2 = bt2.insertChild(b2, 5, true);
        bt2.insertChild(b2, 6, false); 
        bt2.insertChild(c2, 8, true);
        bt2.insertChild(d2, 9, true);
        
        BinaryNode<Integer> newRoot = mergeTrees(bt1.root, bt2.root);
        
        BinaryTree<Integer> newTree = new BinaryTree<Integer>();
        newTree.root = newRoot;
        newTree.preOrder();
        
    }

    public static  int  findMaxLeft(BinaryNode<Integer> node)
    {
        if(node ==null) {return 0;}
        int max = 0;

        if(node.left !=null)
        {
            if(node.left.left==null)
            {
             //   System.out.println(node.left.val);
                return node.left.val;
            }
            //System.out.println("Math.max("+findMaxLeft(node.left)+","+max+")");
             max =  Math.max(findMaxLeft(node.left),max);
        }

        if(node.right !=null)
        {
            //System.out.println("Math.max("+findMaxLeft(node.right)+","+max+")");
            max =  Math.max(findMaxLeft(node.right),max);
        }
        return max;
    }

    
    public static int findBottomLeftValue(BinaryNode<Integer> root) {
        return findBottomLeftValue(root,0, new int[]{0,0});
    }
    
    public static int findBottomLeftValue(BinaryNode<Integer> node, int depth, int[] res) {
        //res[0]深度 res[1]值 相同的深度只能赋值一次
        if(depth > res[0]){res[1]=node.val;res[0]=depth;}
        
        //left在前 优先赋值左值
        if(node.left != null) { findBottomLeftValue(node.left, depth+1,res);} //下面有return,不能立即返回
        if(node.right != null) { findBottomLeftValue(node.right, depth+1,res);} //下面有return,不能立即返回
        return res[1];
    }
    
    
    public static BinaryNode<Integer>  mergeTrees(BinaryNode<Integer> t1, BinaryNode<Integer> t2) {
        if(t1 == null && t2 == null) return null;
        BinaryNode<Integer> newNode = new BinaryNode<Integer>();
        newNode.val = (t1==null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        newNode.left = mergeTrees(t1 == null ? null : t1.left ,t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right ,t2 == null ? null : t2.right);
        return newNode;
    }

    























}
