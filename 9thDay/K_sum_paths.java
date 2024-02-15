link->https://www.geeksforgeeks.org/problems/k-sum-paths/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions





int count = 0;
    public int sumK(Node root,int k)
    {
        if(root == null)return 0;
        ArrayList<Integer>list = new ArrayList<>();
         helper(root,k,list);
         return count;
    }
    void helper(Node root,int k,ArrayList<Integer>list){
        if(root == null){
            return;
        }
        list.add(root.data);
        int total = 0;
        for(int i = list.size() - 1; i >= 0 ; i--){
            total += list.get(i);
            if(total == k){
             count++;
            }
        }
        helper(root.left, k , list);
        helper(root.right, k, list );
        list.remove(list.size() - 1);
    }