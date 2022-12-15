package com.pack3;

public class midPointOfLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void pushNode(int data){
            Node currentNode= new Node(data);
            currentNode.next=head;
            head=currentNode;
        }
        public int getLen(){
            int length=0;
            Node temp = head;
            while(temp!=null){
                length++;
                temp= temp.next;
            }
            return length;
        }
        public void printMiddele() {
            if (head != null) {
                int length = getLen();
                Node temp = head;
                int middelLength = length/2;
                while(middelLength!=0){
                    temp = temp.next;
                    middelLength--;
                }
                System.out.println(temp.data);
            }
        }

    public static void main(String[] args) {
        midPointOfLinkedList list = new midPointOfLinkedList();
        for(int i=5;i>=0;i--){
            list.pushNode(i);
            list.printMiddele();
        }
    }
}
