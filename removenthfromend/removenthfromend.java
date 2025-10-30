package removenthfromend;

class ListNode {
     int val;
     ListNode next;
     ListNode(int val) { this.val = val; this.next=null;}

 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
public class removenthfromend{
    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Solution a=new Solution();
        ListNode head=new ListNode(1);
    //   head.next=new ListNode(2);
    //     head.next.next=new ListNode(3);
    //   head.next.next.next=new ListNode(4);
    //     head.next.next.next.next=new ListNode(5);
        head=a.removeNthFromEnd(head, 1);
        printList(head);
    }
}