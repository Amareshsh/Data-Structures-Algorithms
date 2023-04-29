package day5.com;

public class Queue {

    public class queueNode{
        int data;
        queueNode next;

        public queueNode(int data){
            this.data = data;
        }
    }

    queueNode front;

    queueNode rear;

    public void enQueue(int data){
        queueNode newNode = new queueNode(data);
        if (front == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int deQueue(){
        if(front == null){
            return -1;
        }else {
            queueNode temp = front;
            front = front.next;
            temp.next = null;
            return temp.data;
        }
    }
}
