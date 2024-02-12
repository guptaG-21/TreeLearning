
link->https://www.geeksforgeeks.org/problems/largest-bst/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



static int max = 0;
    static int largestBst(Node root)
    {
        trav(root);
        int k = max;
        max = 0;
        return k;
    }
    static void trav(Node node){
        if(node == null)return;
        ArrayList<Integer>list = new ArrayList<>();
        addItem(node,list);
        if(isSorted(list)){
            max = Math.max(max,list.size());
        }
        trav(node.left);
        trav(node.right);
    }
    static void addItem(Node node,ArrayList<Integer>list){
        if(node==null)return;
        addItem(node.left,list);
        list.add(node.data);
        addItem(node.right,list);
    }
    static boolean isSorted(ArrayList<Integer>ans){
        if(ans.size()==1)return true;
        for(int i =1;i<ans.size();i++){
            if(ans.get(i)<=ans.get(i-1))return false;
        }
        return true;
    }