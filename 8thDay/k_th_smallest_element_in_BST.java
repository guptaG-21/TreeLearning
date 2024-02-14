link->https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab




class Solution {
    int count = 0;
    // Return the Kth smallest element in the given BST
   
    public int KthSmallestElement(Node root, int k) {
        if(root == null)return -1;

        int left = KthSmallestElement(root.left,k);
        if(left!=-1)return left;
        count++;
        if(count == k)return root.data;
        return KthSmallestElement(root.right,k);
    }
    
}