package day3.com;

public class Queue {

    QueueNode front;
    QueueNode back;

    private static class QueueNode {

        int iData;
        QueueNode next;

        public QueueNode(int data) {
            this.iData = data;
        }
    }

        public void insertQueue(int data){
            if(front == null && back == null){
                QueueNode temp = new QueueNode(data);
                front = temp;
                back = temp;
            }else{
                QueueNode temp = new QueueNode(data);
                back.next = temp;
                back = temp;
            }
        }

        public int deque(){
        if(front == null){
            return 0;
        }else{
            QueueNode temp = front;
            front = front.next;
            temp.next = null;
            return temp.iData;
        }
        }

}
