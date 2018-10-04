/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.solution;

import linkedlist.utils.ListNode;
import linkedlist.utils.SinglyLinkedList;

/**
 *
 * @author baoge
 */
public class MergeTwoSortedLists_21 {
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.append(1);
        list.append(3);
        list.append(5);
        
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);
        
        ListNode<Integer> result = mergeTwoLists(list.head.next, list2.head.next);
        SinglyLinkedList<Integer> temp = new SinglyLinkedList<Integer>();
        temp.head = result;
        System.out.println(temp.toString());
    }
    
    public static ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> head = new ListNode<Integer>(0);
        ListNode<Integer> p=head; 
        while(l1!=null && l2!=null)
        {
            if(l1.val > l2.val)
            {
                p.next = new ListNode<Integer>(l2.val);                
                l2 = l2.next;
            }
            else
            {
                p.next = new ListNode<Integer>(l1.val);
                l1 = l1.next;
            }
            p=p.next;
        }
        
        while(l1!=null)
        {
            p.next = new ListNode<Integer>(l1.val);
            l1 = l1.next;
            p=p.next;
        }
                
        while(l2!=null)
        {
            p.next = new ListNode<Integer>(l2.val);
            l2 = l2.next;
            p=p.next;
        }

        return head;
    }
}
