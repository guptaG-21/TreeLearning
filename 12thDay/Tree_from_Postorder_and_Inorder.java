link->https://www.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


Node buildTree(int in[], int post[], int n) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<in.length;i++){
            hm.put(in[i],i);
        }
        return helper(in,0,n-1,post,0,n-1,hm);
    }
    Node helper(int[] in, int is,int ie,int[]post,int ps,int pe,HashMap<Integer,Integer>hm){
        if(is>ie || ps>pe)return null;
        Node node = new Node(post[pe]);
        int inRoot = hm.get(post[pe]);
        int numsLeft = inRoot - is;
        node.left = helper(in,is , inRoot-1,post,ps,ps+numsLeft-1,hm);
        node.right = helper(in,inRoot+1,ie,post,ps+numsLeft,pe-1,hm);
        return node;
    }