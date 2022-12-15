package com.DSA2;

import java.util.stream.StreamSupport;

class dataAdd{
    public static void main(String[] args) {
        middleLinkedList ll = new middleLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(1);
        ll.add(6);
        ll.add(1);
        ll.print();
        ll.getLen();
        ll.middleElement();
        ll.middleElementUsingSlow();
        ll.countNumberOfOccurant(1);
    }
}
public class middleLinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public int getLen(){
        int count = 0;
        Node temp =head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void print(){
        if (head==null){
            return;
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
    }
    public void middleElement(){
        if(head != null){
            int length=getLen();
            int middle = length/2;
            Node temp = head;
            while (middle>0){
                temp=temp.next;
                middle--;
            }
            System.out.print(temp.data);
        }
        System.out.println();
    }
    public void middleElementUsingSlow(){
        Node slow=head;
        Node fast=head;
        boolean move = true;
        while(slow != null && fast !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public void countNumberOfOccurant(int number){
        int count = 0;
        Node temp = head;
        while (temp != null){
            if(temp.data==number){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(count);
    }
}
