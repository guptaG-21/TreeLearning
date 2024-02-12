link->https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions




int findDist(Node root, int a, int b) {
       if(root==null)return -1;
       Node le = lca(root,a,b);
       int distLeft = Length(le,a);
       int distRight = Length(le,b);
       return distLeft+distRight;
    }
    int Length(Node root,int num){
        if(root==null)return -1;
        if(root.data == num)return 0;
        int left = Length(root.left,num);
        int right = Length(root.right,num);
        
        if(left!=-1){
            return left+1;
        }
        if(right!=-1)return right+1;
        return -1;
    }
    Node lca(Node node,int a,int b){
        if(node == null || node.data == a || node.data == b)return node;
        Node left = lca(node.left,a,b);
        Node right = lca(node.right,a,b);
        if(left==null)return right;
        else if(right==null)return left;
        else return node;
    }