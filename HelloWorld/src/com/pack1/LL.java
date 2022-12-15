package com.pack1;

import java.util.stream.StreamSupport;

public class LL {
    public static void main(String[] args) {
        myCurrentList list = new myCurrentList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("python");
        list.print();
        list.delete("Java");
        list.print();
    }
}
class myCurrentList{
    Node head;
    public void add(String data){
        Node newNode=new Node(data);
        // checking if List is empty
        if(head==null){
            head=newNode;
        }
        // if list is not empty
        else {
            Node temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            // temp is last node of the current node
            temp.nextNode=newNode;
        }
    }
    public void print(){
        System.out.println("list is empty");
        if(head==null){
            System.out.println("This is list is empty");
            return;
        }
        else {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.nextNode;
            }
            System.out.println("");
        }
    }
    public void delete(String data){
        if(head==null){
            System.out.println("List is empty");
        }
        else if (head.data==data) {
            head=head.nextNode;
            System.out.println(data+"Deletion has been done");
        }
    }
}
class Node{
    public String data;
    public Node nextNode;
    public Node(String data){
        this.data=data;
    }
}
