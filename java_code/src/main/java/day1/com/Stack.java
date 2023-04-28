package day1.com;

public class Stack<Integer> {
    public StackNode<Integer> top;

    public static class StackNode<Integer>{
        StackNode<Integer> next;
        public int data;
        public StackNode(int data){
            this.data = data;
        }
    }

    public void pushStack( int data){
        StackNode<Integer> temp = new StackNode<Integer>(data);
        if(top == null){
            top = temp;
        }else {
            temp.next = top;
            top = temp;
        }
    }

    public int popStack(){
        int temp = 0;
        try{
            temp = top.data;
            top = top.next;
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
      return temp;
    }
}
