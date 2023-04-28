package day2.com;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.pushData(10);
        stack.pushData(12);
        stack.pushData(16);
        stack.pushData(20);
        stack.pushData(24);

        stack.popData();
        stack.popData();

        System.out.println(stack.peekData());

        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(12);
        queue.enQueue(14);
        queue.enQueue(16);
        queue.enQueue(20);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());




    }
}
