/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package leetcode;


import linkedlist.utils.*;




/**
 *
 * @author baoge
 */
public class List {
 
    /* 
    public static void main(String[] args)
    {
        List l=new List();
        //l.reverseListTest();
        l.reverseBetweenTest();
    }
   */
    
    public ListNode reverseList(ListNode<Integer> head) {
        ListNode<Integer> prev=null;
        ListNode<Integer> next=null;

        //head->null head后面插入null
        //1->head 1后面插入head
        //2->1 2后面插入1
        //3->2
        //4->3
        //5->4
        //head 1 2 3 4 5
        //
        while(head!=null)
        {
//            next=head.next;//1 2 3     
//            head.next=prev;//1 null, 1 head, 2 1
//            prev=head;  //head 1
//            head=next;  //1 2
            
            next=head.next;//备份它的下一个
            
            head.next=prev;//只管当前节点插入前面个（下一个为前面个）
            
            prev=head; //记录前面个
            head=next;//向后移动 下一个    
        }        
        return prev;
    }
    
    public void reverseListTest()
    {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 4);
        list.insert(4, 5);
        
       // p
        //1 2 3 4 5
        //2 1 3
        //
        ListNode<Integer> p=this.reverseList(list.head); 
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }    
        
        
        
        
        //System.out.println(list.length());
        
        
       
    }


    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m<1 || m>n){return head;}
        

        ListNode<Integer> prev=null;
        ListNode<Integer> next=null;
        ListNode<Integer> start=null;
        ListNode<Integer> end=null;
        ListNode<Integer> head2=head;
        
        
        
        int i=1;
        while(head!=null)
        {
            //3 5
            
            //5<-2<-3<-4<-1
            //1 2<-3<-4 5
            // 1 2 3 4 5
            next=head.next;
            
            if(i>m && i<= n+1)
            {
                head.next=prev;
                prev=head;
            }
            else if(i==m)
            {
                start=head;
            }
            else if(i==n+2)
            {
                end=head;
            }
            
            head=next; 
            i++;
        }
        //start.next=prev;
        if(start!=null && start.next!=null)
        {
            start.next.next=end;
            start.next=prev;
        }
        return head2;

}


    public void reverseBetweenTest()
    {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 4);
        list.insert(4, 5);

//          list.insert(0, 5);
//          list.insert(1, 3);
//
//        
       // p
        //1 2 3 4 5
        //2 1 3
        //
        ListNode<Integer> p=this.reverseBetween((ListNode<Integer>)list.head.next,1,2); 
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }    
    }








}
