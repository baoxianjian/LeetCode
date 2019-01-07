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
 * @author XBao
 */
public class ReverseLinkedList2_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
       
        ListNode next = null;
        ListNode prev = null;
        ListNode start = null;
        ListNode end = null;
        ListNode head2 = head;
        
        //2 4
        //1->2->3->4->5->null
        //2->1 ->end
        
        //1-> 2<-3<-4 <-5
        
        //4 5
        //1->2->3->4->5->null
        //
        
        
        
        int i = 1;
        while(head != null){
            next = head.next;
            if(i >= m && i<=n)
            {
                head.next = prev;
                prev = head;
                if(i== m)
                {
                    end = head;
                }
            } 
            else if(i==m-1) 
            {
                start = head;

            }
            else if(i == n+1)
            {
                end.next = head;
            }
            head = next;
            i++;
        }
        if(start==null)
        {
            head2 = prev;
        }
        else
        {
            start.next = prev;
        }
        return head2;
        
        
    }
    
    
        
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        ListNode head = new ReverseLinkedList2_92().reverseBetween(list.head.next, 4, 4);
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
        
    }
    
}
