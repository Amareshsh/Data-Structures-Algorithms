package day4.com;

public class Queue {

    public static class QueueNode{
        int data;
        QueueNode next;

        public QueueNode( int data){
            this.data = data;
        }
    }

    QueueNode head;
    QueueNode tail;

    public void enQueue(int data){
        QueueNode temp = new QueueNode(data);
        if( tail == null){
            temp.next = null;
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    public int deQueue(){
        if( head == null){
            return -1;
        }else{
            QueueNode temp = head;
            head = head.next;
            temp.next = null;
            return temp.data;
        }
    }
}
