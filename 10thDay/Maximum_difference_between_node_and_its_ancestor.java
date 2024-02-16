link->https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



static int ans;
    int maxDiff(Node root)
    {
        ans = Integer.MIN_VALUE;
        dfs(root.left,root.data);   // left
        dfs(root.right,root.data);  // right
        return ans;
    }
    public void dfs(Node root,int max){
        if(root == null){
            return;
        }
        ans = Math.max(max-root.data, ans);
        max = Math.max(root.data, max);
        dfs(root.left, max);
        dfs(root.right, max);
    }