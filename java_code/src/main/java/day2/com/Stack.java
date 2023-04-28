package day2.com;

public class Stack{

    private static class StackNode{
        private StackNode next;
        private int data;

        public StackNode(int data){
            this.data = data;
        }
    }

    public StackNode top;

    public void pushData( int data){
        StackNode temp = new StackNode(data);
        if (top != null) {
            temp.next = top;
        }
        top = temp;
    }

    public int popData(){
        if( top == null){
            return -1;
        }else {
            int temp;
            temp = top.data;
            top = top.next;
            return temp;
        }
    }

    public int peekData(){
        if( top == null){
            return -1;
        }else{
            return top.data;
        }
    }
}
