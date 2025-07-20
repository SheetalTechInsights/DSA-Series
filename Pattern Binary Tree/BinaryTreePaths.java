package com.tech.Tree;

import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left,right;

    public Node(int val){
        this.val = val;
        left=right=null;
    }
}
public class BinaryTreePaths {
    Node root;
    public static List<String> treePaths(Node root){
        List<String> paths = new ArrayList<>();
        if(root!=null){
            dfs(root,"",paths);
        }
        return paths;
    }
    public static void dfs(Node node,String path,List<String>paths){
        if(node == null)
            return;
        path+=node.val;

        if(node.left==null && node.right == null){
            paths.add(path);
        }
        else{
            path+="->";
            dfs(node.left,path,paths);
            dfs(node.right,path,paths);
        }
    }


    public static void main(String[] args) {
      BinaryTreePaths tree = new BinaryTreePaths();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.right =new Node(5);

        System.out.println("Paths are: "+treePaths(tree.root));

    }
}
