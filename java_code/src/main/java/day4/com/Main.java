package day4.com;

public class Main {
    public static void main(String [] args){

        Stack testStack = new Stack();

        testStack.pushValue(10);
        testStack.pushValue(20);
        testStack.pushValue(26);
        testStack.pushValue(28);

        System.out.println(testStack.popValue());

        System.out.println(testStack.peekValue());

        Queue testQueue = new Queue();

        testQueue.enQueue(45);
        testQueue.enQueue(48);
        testQueue.enQueue(49);

        System.out.println(testQueue.deQueue());
        System.out.println(testQueue.deQueue());

        System.out.println(testQueue.head.data);
        System.out.println(testQueue.tail.data);

        List testList = new List();

        testList.addList(17);
        testList.addList(19);
        testList.addList(21);
        testList.addList(24);
        testList.addList(26);

        testList.traverseList();
        System.out.println(testList.head.data);
        System.out.println(testList.tail.data);

        BinaryTree testTree = new BinaryTree();
        testTree.insertTree(100);
        testTree.insertTree(120);
        testTree.insertTree(110);
        testTree.insertTree(117);
        testTree.insertTree(140);

        testTree.inOrderTraversal(testTree.root);

    }
}
