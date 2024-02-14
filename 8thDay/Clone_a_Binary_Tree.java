link->https://www.geeksforgeeks.org/problems/clone-a-binary-tree/0

public Tree cloneTree(Tree tree){
       if(tree == null)return null;
       Tree node = new Tree(tree.data);
       node.left = cloneTree(tree.left);
       node.right = cloneTree(tree.right);
       node.random = tree.random;
       
     }