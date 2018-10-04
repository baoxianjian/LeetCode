/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.solution;

import linkedlist.utils.AbstractLList;
import linkedlist.utils.LList;
import linkedlist.utils.ListNode;
import linkedlist.utils.SinglyLinkedList;

/**
 *
 * @author baoge
 */
public class RemoveDuplicatesfromSortedList_83 {
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(3);
        list.append(3);
        list.append(5);
        deleteDuplicates(list.head);
        System.out.println(list.toString());
    }
    
    public static ListNode<Integer> deleteDuplicates(ListNode<Integer> head) {
        ListNode<Integer> p = head;
        while(p!=null && p.next != null)
        {
            if(p.val == p.next.val)
            {
                p.next = p.next.next;
            }
            else
            {
                p = p.next;
            }
        }
        return head;
    }
}
