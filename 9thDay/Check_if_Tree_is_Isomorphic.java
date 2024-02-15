link->https://www.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


boolean isIsomorphic(Node root1, Node root2)  
    { 
        if(root1 == null && root2 == null)return true;
        if(root1!=null && root2==null || root1 ==null && root2!=null)return false;
        boolean identical = isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right);
        boolean mirror = isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left);
        boolean data = root1.data == root2.data;
        
        return identical && data || mirror && data;
    }