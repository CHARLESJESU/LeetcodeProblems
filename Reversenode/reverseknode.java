package Reversenode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution{
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1) return head;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
ListNode prev=dummy;
ListNode curr;
ListNode next;
        while(count>=k){
            curr=prev.next;
            next=curr.next;
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            count-=k;
        }

        return dummy.next;
    }
}

public class reverseknode {
    public static void main(String[] args) {
        Solution a=new Solution();
        ListNode l1=new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode result=a.reverseKGroup(l1, 2);
        while(result!=null){
            System.out.print(result.val);
            result=result.next;
        }
       
    }
}
