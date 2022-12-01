package com.masai.Day15_LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next =  null;
    }
}

class LinkedList{
    Node head;
    public LinkedList(){
        this.head = null;
    }

    public void insertAtTail(int data){
        if(head==null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }


    public void insertAtHead(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
        return;
    }


    public void deleteNode(int data){
        Node current = head;
        while(current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
        return;
    }


    public void printLinkedList(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        return;
    }
}



public class _1LinkedListImpl {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
        for(int i=1;i<5;i++){
            linkedList.insertAtHead(i);
            linkedList.insertAtTail(i);
        }

        linkedList.deleteNode(4);
        linkedList.printLinkedList();
	}
}
