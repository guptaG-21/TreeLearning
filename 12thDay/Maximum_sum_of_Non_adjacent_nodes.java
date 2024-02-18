link->https://www.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


static int getMaxSum(Node root)
    {
        HashMap<Node,Integer> mapping = new HashMap<>();
        if(root == null)return 0;
        if(mapping.containsKey(root))return mapping.get(root);
        int increment = root.data;
        if(root.left!=null){
            increment+=getMaxSum(root.left.left);
            increment+=getMaxSum(root.left.right);
        }
        if(root.right!=null){
            increment+=getMaxSum(root.right.left);
            increment+=getMaxSum(root.right.right);
        }
        int ext = getMaxSum(root.left)+getMaxSum(root.right);
        mapping.put(root,Math.max(increment,ext));
        return mapping.get(root);
    }