package day1.com;

public class BinarySearch {

    public Bnode root;

    public BinarySearch( int data){
        Bnode temp = new Bnode(data);
        root = temp;
    }

    public void insert(int data){
        this.root = insertNode(this.root,data);
    }

    public Bnode insertNode(Bnode roots, int data){
        if( roots != null){
            if(roots.data > data){
                roots.left = insertNode(roots.left,data);
            }else {
                roots.right = insertNode(roots.right,data);
            }
        }else{
            roots = new Bnode(data);
        }
        return  roots;
    }

    public void preOrderTraversal(Bnode root){
        if( root != null){
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Bnode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }
    }

    public void inOrderTraversal(Bnode root){
        if( root != null){
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }
}
