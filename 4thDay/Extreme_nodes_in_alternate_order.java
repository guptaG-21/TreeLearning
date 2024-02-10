link->https://www.geeksforgeeks.org/problems/extreme-nodes-in-alternate-order/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



public  ArrayList<Integer> ExtremeNode(Node root)
      {
        //add code here.
        Queue<Node>q = new LinkedList<>();
        ArrayList<Integer>list = new ArrayList<>();
        q.add(root);
        list.add(root.data);
        boolean isRoot = true;
        boolean flag = true;
        while(!q.isEmpty()){
            int length = q.size();
            if(isRoot){
                for(int i=0;i<length;i++){
                    Node curr = q.poll();
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
                isRoot = !isRoot;
            }else{
                for(int i=0;i<length;i++){
                    Node curr = q.poll();
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                    if(!flag){
                        if(i==0){
                            list.add(curr.data);
                        }
                    }else{
                        if(i==length-1){
                            list.add(curr.data);
                        } 
                    }
                }
            }
            
            flag = !flag;
        }
        return list;
      }