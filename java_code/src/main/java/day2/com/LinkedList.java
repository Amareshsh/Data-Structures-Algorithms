package day2.com;

public class LinkedList {

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void append(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    public void deleteNode(int data){
        Node temp,prev;
        temp = head;
        prev = temp;
        while (temp != null){
            if( temp.data == data && head.data == data){
                head = head.next;
                temp.next = null;
                temp = head;
            } else if (temp.data == data && tail.data == data) {
                prev.next = null;
                tail = prev;
                temp = temp.next;
            }else{
                prev.next = prev.next.next;
                temp.next = null;
                temp = prev.next;
            }
        }
    }
}
