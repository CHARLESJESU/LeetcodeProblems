package Add_two_number;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class Solution{
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(0);
ListNode current = dummy;
int carry = 0;
while(l1!=null||l2!=null|carry!=0){
    int x = (l1 != null) ? l1.data : 0;
    int y = (l2 != null) ? l2.data : 0;
    int sum=x+y+carry;
    carry=sum/10;
    current.next=new ListNode(sum%10);
    current=current.next;
    if (l1!=null) {
        l1=l1.next;
    }
      if (l2!=null) {
        l2=l2.next;
    }
 
}


        return dummy.next;
    }
}
public class addtwonumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}

