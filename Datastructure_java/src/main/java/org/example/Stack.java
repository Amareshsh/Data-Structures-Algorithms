package org.example;

public class Stack<Integer> {

    public static class StackNode<Integer>  {
        private int data;
        private StackNode<Integer> next;

        public StackNode(int data){
            this.data = data;
        }

    }

    private StackNode<Integer> top;

    public void push(int data){
        StackNode<Integer> st = new StackNode<Integer>(data);
        st.next = top;
        top = st;

    }

    public int pop(){
        if(top == null){
            return  -1;
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int peek(){
        if( top == null){
            return 0;
        }
        return top.data;
    }
}
