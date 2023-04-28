package day1.com;

public class Queue<Integer>{

    public static class QueueNode<Integer>{
        public int data;
        public QueueNode<Integer> next;

        public QueueNode(int data){
            this.data = data;
        }
    }

    public QueueNode<Integer> frontNode;
    public QueueNode<Integer> backNode;

    public void addQueue( int data){
        QueueNode<Integer> temp = new QueueNode<Integer>(data);
        if( frontNode == null){
            frontNode = temp;
            backNode = temp;
        }else{
            backNode.next = temp;
            backNode = temp;
        }
    }

    public int deleteQueue(){
        if( frontNode == null){
            return 0;
        }else{
            if(frontNode == backNode){
                int temp = frontNode.data;
                frontNode = frontNode.next;
                backNode = frontNode;
                return temp;
            }else {
                int temp = frontNode.data;
                frontNode = frontNode.next;
                return temp;
            }
        }

    }
}
