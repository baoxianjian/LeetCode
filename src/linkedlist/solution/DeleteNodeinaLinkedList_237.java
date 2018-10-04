package linkedlist.solution;


import linkedlist.utils.ListNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class DeleteNodeinaLinkedList_237 
{
    public static void main(String[] args)
    {
        
    }
    
    public static void deleteNode(ListNode<Integer> node) {
        //将当前节点删除,无法知道上一个节点, 所以切换值
        node.val = node.next.val;
        node.next =  node.next.next;
    }
    
}
