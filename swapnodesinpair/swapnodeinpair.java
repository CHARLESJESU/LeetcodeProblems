package swapnodesinpair;

class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy =new ListNode(0);
        ListNode current=dummy;
        dummy.next=head;
        while(current.next!=null&&current.next.next!=null){
         ListNode first=current.next;
         ListNode second=current.next.next;
         first.next=second.next;
         second.next=first;
         current.next=second;
         current=first;
        }
        return dummy.next;
    }
}

public class swapnodeinpair {
    public static void main(String[] args) {
        Solution a=new Solution();
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode answer=a.swapPairs(l1);
        while(answer!=null){
            System.out.println(answer.val);
            answer=answer.next;
        }
    }
}
