

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val ;
    Node left,right = null;

    Node(int val){
        this.val =val;
        left=right = null;

    }
}

public class LevelOrderTraversal {
    Node root;
   /* public  void travers(com.tech.Tree.Node root){
        if(root == null)
            return;
        Queue<com.tech.Tree.Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            com.tech.Tree.Node temp = queue.poll(); //it removes and returns node from queue
            System.out.print(temp.val+" ");

            if(temp.left != null)
                 queue.add(temp.left);
            if(temp.right != null)
                 queue.add(temp.right);
        }
    }

    */

    public List<List<Integer>> traverse(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<levelSize;i++) {
                Node temp = queue.poll();
                list.add(temp.val);

                if (temp.left !=null)
                    queue.add(temp.left);
                if(temp.right!= null)
                    queue.add(temp.right);
            }
            result.add(0,list); // reverse
        }
        return  result;
    }


    public List<List<Integer>> zigZagTraverse(Node root){
        List<List<Integer>> result  = new ArrayList<>();
        if(root== null)return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<levelSize;i++){
               Node node = queue.poll();
               if(flag){
                   list.add(node.val);
               }else {
                   list.add(0, node.val);
               }

               if(node.left!= null)queue.add(node.left);
               if(node.right!= null)queue.add(node.right);
            }
        result.add(list);
        flag = !flag;

        }
        return result;
    }

    public List<Double> average(Node root){

        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node> queue  = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int  levelSize = queue.size();
            //List<Double>list = new ArrayList<>();
            double nodeSum = 0;

            for(int i =0;i<levelSize;i++){
               // int nodeSum = 0;
                Node node = queue.poll();
                nodeSum+=node.val;

                if(node.left!= null )queue.add(node.left);
                if(node.right!= null)queue.add(node.right);
            }
            result.add(nodeSum/levelSize);
        }

        return result;
    }

    public  int height(Node root){
       if(root == null){
           return 0;
       }
       return 1+(Math.max(height(root.left),height(root.right)));

    }

    public  int MinimumDepth(Node root) {
        //int minDepth = 0;
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
            int minDepth =0;
            while (!queue.isEmpty()) {
                minDepth++;
                int levelSize = queue.size();


                for (int i = 0; i < levelSize; i++) {
                    Node currentNode = queue.poll();

                    if (currentNode.left == null || currentNode.right == null) {
                        return minDepth;
                    }

                    if (currentNode.left != null){ queue.add(currentNode.left);}
                    if (currentNode.right != null) queue.add(currentNode.right);

                }
            }

            return minDepth;
        }



    public boolean pathSum(Node root,int targetSum){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        return pathSum(root.left,targetSum-root.val)|| pathSum(root.right,targetSum- root.val);
    }

    public List<List<Integer>> pathSum2(Node root,int target){
        List<List<Integer>> result = new ArrayList<>();
        findPath(root,target,new ArrayList<>(),result);
        return result;
    }
    public static void findPath(Node node,int target,List<Integer>path,List<List<Integer>>result){
      if(node == null){
          return;
      }

      path.add(node.val);
      if(node.left == null && node.right == null && node.val == target){
          result.add(new ArrayList<>(path));
      }
      else{
          findPath(node.left,target- node.val,path,result);
          findPath(node.right,target- node.val,path,result);
      }
      path.remove(path.size()-1);
    }


    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);

        List<List<Integer>> result = tree.traverse(tree.root);
        System.out.println("Level order traversal : "+result);

        LevelOrderTraversal root = new LevelOrderTraversal();
        System.out.println("Height of tree is: "+root.height(tree.root));

        int target = 8;
        System.out.println("Path sum : "+root.pathSum(tree.root,target));

        System.out.println("ZigZag traversal is : "+root.zigZagTraverse(tree.root));

        System.out.println("Level Averages: "+ root.average(tree.root));

        System.out.println("MinimumDepth of Binary tree is: "+root.MinimumDepth(tree.root));
        int targ = 8;
        System.out.println("All paths are: "+root.pathSum2(tree.root,targ));
    }
}
