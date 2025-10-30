package mergetwolist;


class ListNode {
      int val;
     ListNode next;

    ListNode(int val) { this.val = val;}
 }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(list1!=null && list2!=null){
            if((list1.val) <= (list2.val)){
                current.next=list1;
                list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }
        else{
            current.next=list2;
        }
return dummy.next;
    }
}
public class mergetwolist {
    public static void PrintList(ListNode m){
        while(m!=null){
            System.out.print(m.val);
            m=m.next;
        }
    }
    public static void main(String[] args) {
          ListNode b=new ListNode(1);
        b.next=new ListNode(2);
        b.next.next=new ListNode(4);
ListNode c=new ListNode(1);
c.next=new ListNode(3);
c.next.next=new ListNode(4);

        Solution a=new Solution();
      
        ListNode m=a.mergeTwoLists(b,c);
        PrintList(m);
    }
}
