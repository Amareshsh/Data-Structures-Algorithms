package day5.com;

public class Main {

    public static void main(String [] args){

        Stack newStack = new Stack();

        newStack.pushStack(10);
        newStack.pushStack(12);
        newStack.pushStack(14);
        newStack.pushStack(16);
        System.out.println(newStack.popStack());
        System.out.println(newStack.popStack());

        System.out.println(newStack.peekStack());

        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        newQueue.enQueue(12);
        newQueue.enQueue(18);
        newQueue.enQueue(19);
        newQueue.enQueue(21);
        newQueue.enQueue(26);

        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());

        newQueue.enQueue(29);
        newQueue.enQueue(32);

        LinkedList newList = new LinkedList();
        newList.pushList(100);
        newList.pushList(120);
        newList.pushList(140);
        newList.pushList(160);

        newList.traverseList();

        Tree newTree = new Tree();

        newTree.insertTree(10);
        newTree.insertTree(8);
        newTree.insertTree(7);
        newTree.insertTree(5);
        newTree.insertTree(12);
        newTree.insertTree(14);
        newTree.insertTree(16);


        System.out.println("Inorder traversal of tree");
        newTree.inOrderTraverse(newTree.root);
        System.out.println("Preorder traversal of tree");
        newTree.preOrderTraverse(newTree.root);
        System.out.println("Postorder traversal of tree");
        newTree.postOrderTraverse(newTree.root);

    }
}
