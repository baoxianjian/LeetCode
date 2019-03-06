/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.utils;

/**
 *
 * @author baoge
 */
public class TreeNode<T> extends BinaryNode<T> {
    public TreeNode<T> left, right;
    public TreeNode(T val, TreeNode<T> left, TreeNode<T> right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public TreeNode(T val)
    {
        this(val, null, null);
    }
    public TreeNode()
    {
        this(null, null, null);
    }
}
