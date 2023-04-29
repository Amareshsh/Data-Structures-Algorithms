package day5.com;

public class Tree {

    public static class treeNode{
        int data;

        treeNode left;
        treeNode right;

        public treeNode(int data){
            this.data = data;
        }
    }

    treeNode root;

    public void insertTree(int data){
        if( root == null){
            treeNode temp = new treeNode(data);
            root = temp;
        }else{
            root = insertNode(data , root);
        }
    }

    public treeNode insertNode(int data, treeNode root){

        if( root == null){
            treeNode temp = new treeNode(data);
            root = temp;
        }else{
            if( data < root.data){
               root.left = insertNode(data,root.left);
            }else{
                root.right = insertNode(data, root.right);
            }
        }
        return root;
    }

    public void inOrderTraverse(treeNode root){
        if( root == null){
            return;
        }else{
            inOrderTraverse(root.left);
            System.out.println(root.data);
            inOrderTraverse(root.right);
        }
    }

    public void preOrderTraverse(treeNode root){
        if( root == null){
            return;
        }else{
            System.out.println(root.data);
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public void postOrderTraverse(treeNode root){
        if( root == null){
            return;
        }else{
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
            System.out.println(root.data);
        }
    }
}
