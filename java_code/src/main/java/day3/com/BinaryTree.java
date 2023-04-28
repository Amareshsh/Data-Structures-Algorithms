package day3.com;

public class BinaryTree {

    public static class bNode{

        int iData;
        bNode left;
        bNode right;

        public bNode(int data){
            this.iData = data;
        }
    }

    bNode root;

    public void insertTree( bNode node,int data){
        if( root == null){
            root = node;
        }else{
            bNode temp = root;
            while (temp != null){
                if(temp.iData < data){
                    temp = temp.right;
                }else{
                    temp = temp.left;
                }

            }
            temp = node;
        }
    }
}
