package day3.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to java programming day3");

        Stack stack = new Stack();
        stack.pushNode(10);
        stack.pushNode(12);
        stack.pushNode(14);
        stack.pushNode(16);

        System.out.println(stack.peek());
        System.out.println(stack.popNode());
        System.out.println(stack.peek());

        Queue queue = new Queue();
        queue.insertQueue(10);
        queue.insertQueue(12);
        queue.insertQueue(14);
        queue.insertQueue(16);
        queue.insertQueue(18);
        queue.insertQueue(20);
        queue.insertQueue(22);
        queue.insertQueue(24);

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

        List list = new List();
        list.pushList(10);
        list.pushList(12);
        list.pushList(14);
        list.pushList(16);
        list.printList();
    }
}
