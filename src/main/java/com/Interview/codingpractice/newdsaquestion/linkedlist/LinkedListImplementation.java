package com.Interview.codingpractice.newdsaquestion.linkedlist;

public class LinkedListImplementation {
    private int size ;

    public LinkedListImplementation(){
        this.size = 0;
    }

    Node head ;
    class  Node{
        String data;
        Node next;

        public  Node (String data){
            this.data =  data;
            this.next = null;
            size++;
        }
    }

    // add first
    public  void addFirst(String data){
        Node newNode  =  new Node(data);
        if(head  == null){
            head  = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


//  add last
    public void addLast(String data){
        Node newNode  =  new Node(data);
        if(head == null){
            head  =  newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null){
              currentNode =  currentNode.next;
        }
        currentNode.next = newNode;
    }

    // delete first
    public  void deleteFirst(){
        if(head  == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete Last
    public  void deleteLast(){
        if(head  ==  null){
            return;
        }
        size --;
        if(head.next == null){
            head =  null;
            return;
        }


        Node secondLast   =  head;
        Node lastNode     =  head.next;

        while(lastNode.next != null){
            lastNode =  lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public  void display(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node node =  head;

        while (node != null){
            System.out.print(node.data+" --> ");
            node = node.next;
        }
        System.out.println("null");

    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {

        LinkedListImplementation linkedListImplementation =  new LinkedListImplementation();
        linkedListImplementation.addFirst("list");
        linkedListImplementation.addFirst("a");
        linkedListImplementation.addFirst("is");
        linkedListImplementation.addFirst("This");
        linkedListImplementation.display();

        linkedListImplementation.addLast("a");

        linkedListImplementation.deleteLast();

        System.out.println(linkedListImplementation.getSize());


    }
}
