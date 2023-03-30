package org.example;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
       Node newNode = new Node(value);
       head = newNode;
       tail = newNode;
       length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if( length == 0){
            tail = newNode;
            head = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length = length + 1;
    }

    public void remove(int value){
        Node temp = head;
        Node prev = head;
        if( length > 0) {
            while (temp != null) {
                if (temp.value == value) {
                    if (temp == head) {
                        this.head = temp.next;
                        temp.next = null;
                        length = length - 1;
                        return;
                    } else if (temp == tail) {
                        this.tail = prev;
                        tail.next = null;
                        length = length - 1;
                        return;
                    } else {
                        prev.next = temp.next;
                        length = length - 1;
                        return;
                    }
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int returnLength(){
        return this.length;
    }

    public int returnHead(){
        if(length == 0){
            return -1;
        }
        return this.head.value;
    }

    public int returnTail(){
        if(length == 0){
            return -1;
        }
        return this.tail.value;
    }

    public int returnIndex(int index){
        if(length ==0 || length<index){
            return -1;
        }
        Node temp = head;
        for(int i =0 ; i< length; i++){
            if( i == index){
                return temp.value;
            }
            temp = temp.next;
        }
        return  -1;
    }

    public void setIndexValue(int index, int value) {
        if(length ==0 || length<index){
            return;
        }
        Node temp = head;
        for(int i =0 ; i< length; i++){
            if( i == index){
                temp.value = value;
            }
            temp = temp.next;
        }
    }
}
