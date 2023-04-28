package day3.com;

public class List {

    ListNode head;
    ListNode tail;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public void pushList(int data){
        ListNode temp = new ListNode(data);
        if(tail == null && head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    public void printList(){
        ListNode temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
