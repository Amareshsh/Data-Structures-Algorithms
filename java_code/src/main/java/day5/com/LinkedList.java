package day5.com;

public class LinkedList {

    public static class linkedNode{
        int data;

        linkedNode next;

        public linkedNode(int data){
            this.data = data;
        }
    }

    linkedNode head;
    linkedNode tail;

    public void pushList(int data){
        linkedNode temp = new linkedNode(data);

        if( tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    public void traverseList(){

        if( head == null){
            return;
        }else{
            linkedNode temp = head;

            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
