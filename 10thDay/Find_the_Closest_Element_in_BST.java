link->https://www.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



static int minDiff(Node  root, int K) 
    { 
        int result = Math.abs(K-root.data);
        while(root!=null){
            if(root.data == K)return 0;
            if(result>Math.abs(K-root.data)){
                result = Math.abs(K-root.data);
            }
            if(root.data > K)root = root.left;
            else root = root.right;
        }
        return result;
    }