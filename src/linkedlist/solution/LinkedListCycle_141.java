/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.solution;

import java.util.HashSet;
import java.util.Set;
import linkedlist.utils.ListNode;
import linkedlist.utils.SinglyLinkedList;

/**
 *
 * @author baoge
 */
public class LinkedListCycle_141 {
    
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.append(1);
        list.append(2);


        list.getLast().next= list.head.next;
        
        
        System.out.println(hasCycle(list.head));
    }
    
    public static boolean hasCycle(ListNode<Integer> head)
    {
        if(head == null || head.next == null) return false;
        
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head.next;
        
        while(slow != fast)
        {
            if(fast == null || fast.next == null) return false;
            
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
    public static boolean hasCycle1(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return false;
        }

        //一个跑得慢，一个跑得快
        ListNode<Integer> slow = head;
        ListNode <Integer> fast = head.next;

        //两个相遇 说明有环
        while (slow != fast) {
            //有null,即有缺口,即无环
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
    public static boolean hasCycle2(ListNode head) {
    Set<ListNode> nodesSeen = new HashSet<>();
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true;
        } else {
            nodesSeen.add(head);
        }
        head = head.next;
    }
    return false;
}
}
