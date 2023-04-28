package day4.com;

public class Stack {

    public static class StackNode{
        int data;
        StackNode nodeNext;

        public StackNode(int data){
            this.data = data;
        }
    }

    public StackNode top;

    public void pushValue( int data){
        if( top == null){
            top = new StackNode(data);
        }else{
            StackNode temp = new StackNode(data);
            temp.nodeNext = top;
            top = temp;
        }
    }

    public int popValue(){

        if ( top == null){
            return -1;
        }else{
            StackNode temp = top;
            top = top.nodeNext;
            temp.nodeNext = null;
            return temp.data;
        }
    }

    public int peekValue(){
        if ( top == null){
            return -1;
        }else{
            return top.data;
        }
    }
}
