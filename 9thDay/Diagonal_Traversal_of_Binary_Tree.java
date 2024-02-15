link->https://www.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions



public ArrayList<Integer> diagonal(Node root)
      {
           
           Queue<Node> q = new LinkedList<>();
           ArrayList<Integer>list = new ArrayList<>();
           q.offer(root);
           while(!q.isEmpty()){
               Node tmp = q.poll();
               while(tmp!=null){
                   list.add(tmp.data);
                   if(tmp.left!=null){
                       q.offer(tmp.left);
                   }
                   tmp = tmp.right;
               }
           }
           return list;
      }