package com.DSA2;

public class linkedList {
    public static void main(String[] args) {
        MyCustomList ll = new MyCustomList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        //ll.deleteFrist(1);
        //ll.DeleteLast(5);
        ll.DeleteGivenPosition(5);
        ll.print();
    }
}

class Node{
    public int data;
    public Node next;
    public  Node(int data){
        this.data=data;
    }
}
class MyCustomList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // list is empty
            head = newNode;
        } else {
            // list is not empty
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // temp is last node of the current list
            temp.next = newNode;
        }

    }
    // printing the list
    public void print() {
        System.out.println("If the list is empty");
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    // deleating data at the
    public void deleteFrist(int data){
        if(head==null){
            System.out.println("List has empty");
        }
        else{
            if(head.data==data){
                head=head.next;
            }
        }
    }
    // delete Last
    public void DeleteLast(int data){
        Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void DeleteGivenPosition(int data){
        if(head==null){
            return;
        }
        else if (head.data==data){
            head=head.next;
            return;
        }
        else{
            Node temp=head;
            while (temp.next != null){
                if(temp.next.data==data){
                    temp.next=temp.next.next;
                    return;
                }
                else {
                    temp=temp.next;
                }
            }
        }
    }
    public void insertNodeAtGivePosition(Node InsertNode, int position, int data){
        if(head==null){
            return;
        }
        else {
            Node temp=head;
            int count=0;
            while(temp !=null){
                count++;
                if(count == position){

                }
            }
        }
    }
}


