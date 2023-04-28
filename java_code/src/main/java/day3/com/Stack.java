package day3.com;

public class Stack {
    private static class StackNode{
        int iData;
        StackNode next;
        public StackNode(int data){
            this.iData = data;
        }
    }

    public StackNode top;

    public void pushNode(int data){
        if(top == null){
            top = new StackNode(data);
        }else{
            StackNode node = new StackNode(data);
            node.next = top;
            top = node;
        }
    }

    public int popNode(){
        if(top ==null){
            return 0;
        }else{
            StackNode temp = top;
            top = top.next;
            temp.next = null;
        }
        return top.iData;
    }

    public int peek(){
        if(top == null){
            return 0;
        }else{
            return top.iData;
        }
    }
}
