package day4.com;

public class List {

    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    ListNode head;
    ListNode tail;

    public void addList(int data){
        if(head == null){
            ListNode listNode = new ListNode(data);
            head = listNode;
            tail = listNode;
        }else{
            ListNode listNode = new ListNode(data);
            tail.next = listNode;
            tail = tail.next;
        }
    }

    public void traverseList(){
        if(head == null){
            return;
        }else{
            ListNode temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


}
