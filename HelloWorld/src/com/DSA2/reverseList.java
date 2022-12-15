package com.DSA2;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.net.StandardSocketOptions;

public class reverseList {
    public static void main(String[] args) {
        reverse list = new reverse();
        Node head = null;
        list.add(1);
        list.add(2);
        list.add(555);
        list.add(4);
        //list.deleteSPosition(2);
        list.print();
        list.findLength();
        //list.searchElement(3);
        list.LengthOfLast(3);
    }
}
class reverse{
    Node head;
    public void  add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            Node temp=head;
            while (temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void print(){
        System.out.println("List is empty");
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deleteSPosition(int position){
        if(head==null){
            return;
        }
        if(head.data==position){
            head = head.next;
        }
        else {
            Node temp = head;
           while(temp.next != null){
               if(temp.next.data==position){
                   temp.next=temp.next.next;
               }
               else {
                   temp=temp.next;
               }

           }
        }
    }
    public void findLength(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        System.out.println();
        System.out.println(count);
    }
    public void searchElement(int search )
    {
        Node temp = head;
        while(temp != null){
            if(temp.data==search){
               System.out.println("data found ");
            }
            temp=temp.next;
            //System.out.println("data not found ");
        }
    }
    public void LengthOfLast(int n){
        int count = 0;
        if(head==null){
            return;
        }
        else{
            Node temp = head;
            while(temp != null){
                count++;
                temp=temp.next;
            }
            if(n>count){
                return;
            }
            temp=head;
            int i=1;
            while(i<count-n+1){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
