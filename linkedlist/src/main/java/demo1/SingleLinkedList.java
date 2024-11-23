package demo1;

/**
 * ClassName: SingleLinkedlist
 * Time:2024/11/22  10:08
 * Description:
 * Version:
 */

class Node{
    public int data;
    public Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
    }
}


class DoubleNode{
    public int data;
    public DoubleNode next;
    public DoubleNode last;
    public DoubleNode(){

    }
    public DoubleNode(int data){
        this.data=data;
    }
}

public class SingleLinkedList {

    public Node reverseLinkedList(Node head){
        Node pre=null;
        Node next=head.next;
        while(head!=null){
            head.next=pre;
            pre=head;
            head=next;
            next=head.next;
        }


        return pre;
    }


}
