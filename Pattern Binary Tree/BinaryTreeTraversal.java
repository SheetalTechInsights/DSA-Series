package com.tech.Tree;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
      this.val = val;
      left=right = null;
    }
}
public class BinaryTreeTraversal {
    TreeNode root;
    public void preorder(TreeNode node){
        if(node == null)
            return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(TreeNode node){
        if(node== null)
            return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);
    }

    public void postorder(TreeNode node){
        if(node== null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");

    }

    public static void main(String[] args)
    {
      BinaryTreeTraversal tree = new BinaryTreeTraversal();
      tree.root = new TreeNode(1);
      tree.root.left = new TreeNode(2);
      tree.root.right = new TreeNode(3);
      tree.root.left.left = new TreeNode(4);
      tree.root.left.right = new TreeNode(5);
      tree.root.right.left = new TreeNode(6);

        System.out.println("preorder traversal: ");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal: ");
        tree.postorder(tree.root);
     }
}