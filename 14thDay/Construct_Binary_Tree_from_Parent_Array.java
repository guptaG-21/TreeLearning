link->https://www.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions





public static Node createTree(int parent[], int N) {
        Node[] nodes=new Node[N];
        Node root=null;
        for(int i=0; i<N; i++) {
            nodes[i]=new Node(i);
        }
        for(int i=0; i<N; i++) {
            int parentIndex=parent[i];
            if(parentIndex==-1) {
                root=nodes[i];
            } else {
                if(nodes[parentIndex].left==null) {
                    nodes[parentIndex].left=nodes[i];
                } else {
                    nodes[parentIndex].right=nodes[i];
                }
            }
        }
        return root;
    }