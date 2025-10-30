package mergeklist;

import java.util.PriorityQueue;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     if(lists==null||lists.length==0){
        return null;
     }
     PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
     for(ListNode list: lists){
        if(list!=null){
        pq.add(list);}
     }
     ListNode dummy=new ListNode(0);
     ListNode tail=dummy;
     while(!pq.isEmpty()){
        ListNode min=pq.poll();
        tail.next=min;
        tail=tail.next;

        if(min.next!=null){
            pq.add(min.next);
        }
     }
     return dummy.next;
    }
}

public class mergeklistjava {
   
    public static void main(String[] args) {
       Solution a=new Solution();
       ListNode l1=new ListNode(1,new ListNode(4, new ListNode(5)));
       ListNode l2=new ListNode(1,new ListNode(3, new ListNode(2)));
       ListNode l3=new ListNode(2,new ListNode(5, new ListNode(3)));
       ListNode[] list={l1,l2,l3};
       ListNode answer=a.mergeKLists(list);
       while(answer!=null){
        System.out.print(answer.val);
        answer=answer.next;
       }


    }}