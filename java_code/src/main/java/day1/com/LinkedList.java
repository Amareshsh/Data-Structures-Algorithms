package day1.com;

public class LinkedList {
    public Node headNode;
    public Node tailNode;

    public LinkedList(int data){
        Node temp = new Node(data);
        headNode = temp;
        tailNode = temp;
    }

    public void addItem( int data){
        Node temp = new Node(data);
        if ( headNode == null){
            headNode = temp;
        }else{
            tailNode.next = temp;
        }
        tailNode = temp;
    }

    public void deleteItem ( int data) {
        Node temp = headNode;
        Node prev = temp;
        while (temp.next != null){
            if(temp.data == data){
                if(temp == headNode){
                    headNode = temp.next;
                    temp = temp.next;
                }else{
                    prev.next = prev.next.next;
                    temp.next = null;
                    temp = prev.next;
                }
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
        if( temp.data == data){
            if(headNode == tailNode){
                headNode = null;
                tailNode = null;
                return;
            }
            tailNode = prev;
            tailNode.next = null;
        }
    }

    public void printList(){
        if( headNode == null){
            return;
        }else{
            Node temp = headNode;
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
