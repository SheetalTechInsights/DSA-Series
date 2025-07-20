package com.tech.Tree;
class TreeNodes{
    int val;
    TreeNodes left, right;

    TreeNodes(int val){
        this.val = val;
        left=right=null;
    }
}
public class CheckBalanacedBinaryTree {
    TreeNodes root;
    public static int checkHeight(TreeNodes root){
        if(root == null)return 0;
        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1)return -1;

        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1)return -1;

        if(Math.abs(leftHeight-rightHeight) >1)return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
    public boolean isBalanced(TreeNodes root){
    return checkHeight(root)!=-1;
    }

    public static void main(String[] args) {
        CheckBalanacedBinaryTree tree = new CheckBalanacedBinaryTree();
        tree.root = new TreeNodes(1);
        tree.root.left = new TreeNodes(2);
        tree.root.right = new TreeNodes(3);
        tree.root.left.left = new TreeNodes(4);
        tree.root.left.right = new TreeNodes(5);
        tree.root.left.left.left = new TreeNodes(6);
        tree.root.left.left.right = new TreeNodes(7);




    }
}
