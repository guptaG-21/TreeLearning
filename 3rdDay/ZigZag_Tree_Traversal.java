link->https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(root == null)return ans;
	    Deque<Node>q = new LinkedList<>();
	    q.add(root);
	    boolean flag = false;
	    while(!q.isEmpty()){
	        int length = q.size();
	        for(int i=0;i<length;i++){
	            if(flag){
                    Node curr = q.pollLast();
                    ans.add(curr.data);
                    if(curr.right!=null){
                        q.addFirst(curr.right);
                    }
                    if(curr.left!=null){
                        q.addFirst(curr.left);
                    }
                }else{ 
                    Node curr = q.pollFirst();
                    ans.add(curr.data);
                    if(curr.left!=null){
                        q.addLast(curr.left);
                    }
                    if(curr.right!=null){
                        q.addLast(curr.right);
                    }
                }
	        }
	        flag = !flag;
	    }
	    return ans;
	}