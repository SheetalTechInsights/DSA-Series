package com.tech.Tree;

import java.util.Stack;

class node{
    int val ;
    node left,right = null;

    node(int val){
        this.val =val;
        left=right = null;

    }
}
public class DepthFirstSearch {
    node root;
   public  void iterativePreorder(node root){
       if(root == null){
           return;
       }
       Stack<node> stack = new Stack<>();
       stack.push(root);

       while(!stack.isEmpty()){
        node node = stack.pop();
           System.out.print(node.val+" ");

           if(node.right!=null)stack.push(node.right);
           if(node.left!=null)stack.push(node.left);
       }

   }

   public void iterativeInorder(node root){
       if(root == null){
           return;
       }
       Stack<node>stack = new Stack<>();

       node current = root;
       while(current != null || !stack.isEmpty()){
           while(current!=null){
               stack.push(current);
               current= current.left;
           }
           current = stack.pop();
           System.out.print(current.val+" ");
           current=current.right;

       }
   }

   public void iterativePostorder(node root){
       if(root == null){
           return;
       }
       Stack<node>stack1 = new Stack<>();
       Stack<node>stack2 = new Stack<>();

       stack1.push(root);
       while(!stack1.isEmpty()){
          node node =  stack1.pop();
           stack2.push(node);

           if(node.left!=null)stack1.push(node.left);
           if(node.right!=null)stack1.push(node.right);

       }
       while(!stack2.isEmpty()){

           System.out.print(stack2.pop().val+" ");
       }

   }

    public static void main(String[] args) {

       DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);
        tree.root.left.left.left = new node(8);

        System.out.println("DFS Preorder Using Iteration: ");
        tree.iterativePreorder(tree.root);

        System.out.println("\nDFS Inorder Using Iteration:");
        tree.iterativeInorder(tree.root);

        System.out.println("\nDFS Postorder Using Iteration:");
        tree.iterativePostorder(tree.root);
    }
}
