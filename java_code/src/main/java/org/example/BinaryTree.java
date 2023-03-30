package org.example;

import javax.swing.plaf.SplitPaneUI;

public class BinaryTree {
    public BNode root;

    public BinaryTree(int dataRoot){
        root = new BNode(dataRoot);
    }

    public void insertValue(int val){
        if ( root == null){
            root = new BNode(val);
        }else{
            root = insertTree(root,val);
        }
    }

    public BNode insertTree( BNode roots , int val){
        if( roots != null){
            if(roots.data > val){
                roots.left = insertTree(roots.left,val);
            }else{
                roots.right = insertTree(roots.right,val);
            }
        }else{
            roots = new BNode(val);
        }
        return roots;
    }
}
