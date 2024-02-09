link->https://www.geeksforgeeks.org/problems/check-if-subtree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



public static boolean isSubtree(Node T, Node S) {
        if(T == null)return false;
        if(S == null)return true;
        if(helper(T,S))return true;
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    public static boolean helper(Node node1,Node node2){
        if(node1 == null && node2 == null )return true;
        if(node1 == null || node2 == null)return false;
        return node1.data == node2.data && helper(node1.left,node2.left) && helper(node1.right,node2.right);
    }