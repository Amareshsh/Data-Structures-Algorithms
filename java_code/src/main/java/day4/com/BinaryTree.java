package day4.com;

public class BinaryTree {

    public static class TreeNode{
        int data;
        TreeNode  left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;
    public void insertTree( int data){
        if( root == null){
            TreeNode node = new TreeNode(data);
            root = node;
        }else{
           root = insertNode(data,root);
        }
    }

    public TreeNode insertNode(int data , TreeNode root){
        if( root == null){
            root = new TreeNode(data);
        }else{
            if(data < root.data){
                root.left = insertNode(data, root.left);
            }else{
                root.right = insertNode(data,root.right);
            }
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }else{
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }
}
