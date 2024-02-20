link->https://www.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions

class Solution{

    int sum = 0;
    public Node modify(Node root)
    {
        if(root == null)return root;
        modify(root.right);
        sum+=root.data;
        root.data = sum;
        modify(root.left);
        return root;
    }
    
}