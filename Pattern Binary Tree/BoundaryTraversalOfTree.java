package com.tech.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeeNode{
    int val ;
    TreeeNode left,right;

    public TreeeNode(int val){
        this.val = val;
        left=right=null;
    }
}
public class BoundaryTraversalOfTree {
    TreeeNode root;

    public static void getLeftBoundary(TreeeNode root, List<Integer> result){
       TreeeNode current = root.left;
       while(current!=null){
           if(!isLeaf(current)) {
               result.add(current.val);
           }
           current = (current.left!=null)?current.left:current.right;
       }
    }

    public static void getLeaf(TreeeNode root,List<Integer>result){
        if(root== null){
            return;
        }
        if(isLeaf(root)){
           result.add(root.val);
           return;
        }
        getLeaf(root.left,result);
        getLeaf(root.right,result);
    }


    public  static void getRightBoundary(TreeeNode root,List<Integer>result){
            List<Integer> temp = new ArrayList<>();
            TreeeNode current  = root.right;
            while(current!=null){
                if(!isLeaf(current)){
                    temp.add(current.val);
                }
                current = (current.right!=null)? current.right:current.left;
            }
            for(int i=temp.size()-1;i>=0;i--){
                result.add(temp.get(i));
            }
    }

    public static boolean isLeaf(TreeeNode node){
        return (node.left == null && node.right == null);
    }

    public static List<Integer> boundaryTraversal(TreeeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Add root if it's not a leaf
        if (!isLeaf(root)) result.add(root.val);

        getLeftBoundary(root, result);  // Left boundary
        getLeaf(root, result);     // Leaf nodes
        getRightBoundary(root, result); // Right boundary

        return result;
    }

    public static TreeeNode lowestCommonAncestor(TreeeNode root,TreeeNode p,TreeeNode q){
        if(root == null || root == p || root ==q){
            return root;
        }
        TreeeNode left = lowestCommonAncestor(root.left,p,q);
        TreeeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }

        return root;
    }
    public static void main(String[] args) {
      BoundaryTraversalOfTree tree = new BoundaryTraversalOfTree();
      tree.root = new TreeeNode(1);
      tree.root.left = new TreeeNode(2);
      tree.root.right = new TreeeNode(7);
      tree.root.left.left = new TreeeNode(3);
      tree.root.right.right = new TreeeNode(8);
      tree.root.left.left.right = new TreeeNode(4);
      tree.root.right.right.left = new TreeeNode(9);
      tree.root.left.left.right.left = new TreeeNode(5);
      tree.root.left.left.right.right =new TreeeNode(6);
      tree.root.right.right.left.left = new TreeeNode(10);
      tree.root.right.right.left.right = new TreeeNode(11);

        TreeeNode p = tree.root.left.left.right.left;
        TreeeNode q = tree.root.left.left.right.right;
        TreeeNode lca = lowestCommonAncestor(tree.root, p, q);

        System.out.println("Boundary traversal"+boundaryTraversal(tree.root));
        System.out.println("lCA is "+lca.val);
    }
}
