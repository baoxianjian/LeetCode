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
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
       
    ListNode next = null;
    ListNode prev = null;
    ListNode curr = head;
            
   // null->head->  1->   3->   5
   // prev<- curr   next
   //       prev<-  curr  next
   //               prev<-curr  next
   //                     prev<-curr  next 
   //                           prev<-curr  next
    while(curr != null)
    {
        next = curr.next; //backup next
        curr.next = prev; // link to prev
        prev = curr; // save curr to prev
        curr = next; // go to next 
        
    }
        return prev;
    }
    
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.append(1);
        list.append(3);
        list.append(5);
        
        ListNode head = new ReverseLinkedList_206().reverseList(list.head);
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
        
    }
}
