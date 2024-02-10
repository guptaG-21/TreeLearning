link->https://www.geeksforgeeks.org/problems/bst-to-greater-sum-tree/1?page=3&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



static int sum = 0;
    public static void transformTree (Node root)
    {
        sum=0;
        inorder(root);
    }
    public static void inorder(Node root){
        if(root == null)return;
        inorder(root.right);
        int val = root.data;
        root.data = sum;
        sum+=val;
        inorder(root.left);
    }