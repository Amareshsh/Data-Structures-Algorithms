package org.example;

public class Queue<Integer>{
    public static class QueueNode<Integer>{
        private int data;

        private QueueNode<Integer> next;

        public QueueNode(int data){
            this.data = data;
        }
    }

    public  QueueNode<Integer> head;
    public  QueueNode<Integer> tail;

    public void addQueue(int data){
        QueueNode<Integer> temp = new QueueNode<Integer>(data);
        if(head == null && tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    public int deQueue() {
        if (tail == null) {
            return 0;
        }
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public int peek(){
        if( head == null){
            return 0;
        }
        return head.data;
    }
}
