package day2.com;

public class Queue{

    public static class QueueNode{
        private int data;
        private QueueNode next;

        public QueueNode(int data){
            this.data = data;
        }
    }

    public QueueNode front;
    public QueueNode rear;

    public void enQueue(int data){
        QueueNode temp = new QueueNode(data);
        if(front == null){
            front = temp;
            rear = temp;
        }else{
            rear.next = temp;
            rear = temp;
        }
    }

    public int deQueue(){
        if( front == null){
            return -1;
        }else{
            int temp = front.data;
            front = front.next;
            return temp;
        }
    }
}
