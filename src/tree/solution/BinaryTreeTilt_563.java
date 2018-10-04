package tree.solution;

import tree.utils.BinaryNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class BinaryTreeTilt_563 {
    public static void main(String args)
    {
        
    }
    
    public int findTilt(BinaryNode<Integer> node) {
        if(node == null) return 0;
        
        return Math.abs(findTilt(node.left)+findTilt(node.right))+node.val;
    }
}
