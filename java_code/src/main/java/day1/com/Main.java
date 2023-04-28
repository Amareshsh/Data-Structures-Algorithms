package day1.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Stack<Integer> intStack = new Stack<Integer>();
        intStack.pushStack(100);
        intStack.pushStack(120);
        intStack.pushStack(140);
        intStack.popStack();
        intStack.popStack();
        intStack.popStack();
        System.out.println(intStack.popStack());

        Queue<Integer> queue = new Queue<Integer>();
        queue.addQueue(100);
        queue.addQueue(120);
        queue.addQueue(130);
        queue.addQueue(140);
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());

        LinkedList list = new LinkedList(1002);
        list.addItem(1001);
        list.addItem(1002);
        list.addItem(1003);
        list.addItem(1004);
        list.addItem(1002);

        list.deleteItem(1002);
        list.deleteItem(1001);
        list.deleteItem(1003);
        list.deleteItem(1004);

        list.printList();

        BinarySearch tree = new BinarySearch(57);
        tree.insert(32);
        tree.insert(67);
        tree.insert(62);

        System.out.println(tree.root.right.left.data);

        System.out.println("preorder traversal of binary search tree");
        tree.preOrderTraversal(tree.root);

        System.out.println("postorder traversal of binary search tree");
        tree.postOrderTraversal(tree.root);

        System.out.println("inorder traversal of binary search tree");
        tree.inOrderTraversal(tree.root);

    }

}
