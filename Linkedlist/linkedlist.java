package Linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Innerlinkedlist {
    Node head=null;
        public void insert(int data)
{
    Node newNode = new Node(data);

    if(head==null){//first I check list is empty or not
        head=newNode;
        return;
    }
    Node currentNode=head;
    while(currentNode.next!=null){
currentNode=currentNode.next;
    }
    currentNode.next=newNode;

}
public void delete(int value){
    
    if (head == null) {
        return;
    }
    if(head.data==value){
        head = head.next;
        return;
    }
    Node currentNode = head;
    while(currentNode.next!=null && currentNode.data!=value){
        currentNode = currentNode.next;
}

if(currentNode.next!=null){
    currentNode.next = currentNode.next.next;
    return;
}
else{
    System.out.print("value is not found in list");
}

}

public void display(){
    Node currentNode = head;
    while(currentNode!=null){
        System.out.print(currentNode.data+" ");
        currentNode = currentNode.next;
    }
}
}


public class linkedlist{
    public static void main(String[] args) {
        Innerlinkedlist a=new Innerlinkedlist();
        a.insert(2);
        a.insert(7);
        a.delete(2);
        a.display();
    }
}