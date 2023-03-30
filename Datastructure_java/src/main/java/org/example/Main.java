package org.example;

import jdk.jshell.EvalException;

import java.beans.BeanInfo;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void printItems(int n){

        // order on n3
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n;j++){
                for(int k=0; k<n;k++){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }

        // order on n2
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n;j++){
                System.out.println(i+" "+j);
            }
        }

        //order of n
        for(int i=0 ; i< n;i++){
            System.out.println(i);
        }

        int searchKey = 1;

        //order of logn
        for( int i = 9; i > 0 ; i=i-2){
            if(searchKey == i){
                System.out.println("found 1");
                return ;
            }
        }

        //total = O( n3 + n2 + n) => O(n3)
    }

    public void printItems1 ( int a , int b){
        //order of a
        for( int i = 0; i< a; i++){
            System.out.println(i);
        }
        //order of b
        for( int i = 0; i< b; i++){
            System.out.println(i);
        }
        //total = o( a+b)
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //exercise 1
        printItems(10);

        //exercise 2
        Cokkie cokkie1 = new Cokkie("orange");
        Cokkie cokkie2 = new Cokkie("red");

        System.out.println(cokkie2.getColor());
        System.out.println(cokkie1.getColor());

        cokkie2.setColor("yellow");

        System.out.println(cokkie2.getColor());

        //exercise 3

        int num1 = 11;
        int num2 = num1;

        System.out.println(num2);
        System.out.println(num1);

        // exercise 4 ( pointer to hash map)
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();// not in use

        map1.put("value",111);
        map2 = map1;

        map2.put("value",222);

        map3.put("value",333);
        map3= map1;

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        // exercise 5 ( linked list to add the node)
        LinkedList rollNo = new LinkedList(10);
        rollNo.append(12);
        rollNo.append(14);
        rollNo.append(16);
        rollNo.append(18);
        rollNo.append(20);

        rollNo.printList();

        rollNo.remove(16);
        rollNo.printList();

        rollNo.remove(20);
        System.out.println(rollNo.returnTail());

        rollNo.remove(10);
        rollNo.printList();
        System.out.println(rollNo.returnTail());

        System.out.println(rollNo.returnIndex(0));
        rollNo.setIndexValue(0,9);
        System.out.println(rollNo.returnHead());

        rollNo.append(12);
        rollNo.append(14);
        rollNo.append(16);
        rollNo.append(18);
        rollNo.append(20);

        // stacks
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

        //queues
        Queue<Integer> queue = new Queue<Integer>();
        queue.addQueue(1000);
        queue.addQueue(1112);
        queue.addQueue(1114);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.addQueue(900);
        queue.addQueue(980);
        System.out.println(queue.deQueue());
        System.out.println(queue.peek());

        //binary search tree

        BinaryTree tree = new BinaryTree(50);
        tree.insertValue(40);
        tree.insertValue(80);
        tree.insertValue(88);
        tree.insertValue(98);

        System.out.println(tree.root.right.right.right.data);
        System.out.println(tree.root.left.data);
    }
}