package day5.com;

public class Stack {

    public static class StackNode{
        int data;
        StackNode next;

        public StackNode(int data){
            this.data = data;
        }
    }

    public StackNode top;

    public void pushStack(int data){
        StackNode node = new StackNode(data);

        if( top == null){
            top = node;
        }else{
            node.next = top;
            top = node;
        }
    }

    public int peekStack(){

        if( top == null){
            return -1;
        }else{
            return top.data;
        }
    }

    public int popStack(){
        if( top == null){
            return -1;
        }else{
            StackNode temp = top;
            top = top.next;
            temp.next = null;
            return temp.data;
        }
    }
}
