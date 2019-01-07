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
 * @author xbao
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers_old(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        
        while(l1 != null || l2 != null)
        {
            if (l1 != null) {
                sb1.insert(0, l1.val);
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sb2.insert(0, l2.val);
                l2 = l2.next;
            }
        }
        long sum = Long.valueOf(sb1.toString()) + Long.valueOf(sb2.toString());
        char[] chars = String.valueOf(sum).toCharArray();
        
        ListNode result = new ListNode(0);
        ListNode p = result;
        
        for(int i=chars.length-1; i>=0; i--)
        {
            p.next = new ListNode(Integer.valueOf(String.valueOf(chars[i])));
            p = p.next;
        }
        return result.next;
    }
    
    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        

        ListNode<Integer> result = new ListNode(0);
        ListNode<Integer> p = result;
        boolean hasLastOne = false;
        int a = 0;
        int b = 0;
        int c = 0;
        while(l1 != null || l2 != null)
        {
            a = 0;
            b = 0;
            if(l1 != null)
            {
                a = l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null)
            {
                b = l2.val;
                l2 = l2.next;
            }
            
            c = a+b;
            if (c >= 10)
            {
                c = c%10;
                if (l1 != null) 
                {
                    l1.val++;
                }
                else if (l2 != null) 
                {
                    l2.val++;
                }
                else
                {
                    hasLastOne = true;
                }
            }
            p.next = new ListNode<>(c);
            p = p.next;
            
        }
        if (hasLastOne) 
        {
            p.next = new ListNode<>(1);
        }

        return result.next;
    }
    
    
    
    public static void main(String[] args){
//        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
//        list1.append(9);
//        
//        SinglyLinkedList<Integer> list2 = new SinglyLinkedList();
//        list2.append(1);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
//        list2.append(9);
        


//        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
//        list1.append(9);
//        list1.append(9);
//        list1.append(9);
//        SinglyLinkedList<Integer> list2 = new SinglyLinkedList();
//        list2.append(5);
//        list2.append(6);
//        list2.append(4);


        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.append(9);
        list1.append(8);
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList();
        list2.append(1);

        ListNode head = new AddTwoNumbers_2().addTwoNumbers(list1.head.next, list2.head.next);
        
        
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
        
    }
}

