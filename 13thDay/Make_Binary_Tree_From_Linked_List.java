link->https://www.geeksforgeeks.org/problems/make-binary-tree/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


 public static Tree convert(Node head, Tree node) {
        node = new Tree(head.data);
        Queue<Tree>q = new LinkedList<>();
        q.offer(node);
        Node curr = head.next;
        while(curr!=null){
            Tree tmp = q.poll();
            if(curr!=null){
                tmp.left = new Tree(curr.data);;
                q.offer(tmp.left);
                curr = curr.next;
            }
            if(curr!=null){
                tmp.right = new Tree(curr.data);;
                q.offer(tmp.right);
                curr = curr.next;
            }
            
        }
        return node;
    }