link->https://www.geeksforgeeks.org/problems/connect-nodes-at-same-level--170647/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


public void connect(Node root) {
        Queue<Node> node = new LinkedList<>();
        node.add(root);
        while(!node.isEmpty()){
            int size = node.size();
            Node prev = null;
            for(int i=0;i<size;i++){
                Node curr = node.poll();
                curr.nextRight = prev;
                if(curr.right!=null)node.add(curr.right);
                if(curr.left!=null)node.add(curr.left);
                prev = curr;
            }
        }
    }