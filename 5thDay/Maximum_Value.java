link->https://www.geeksforgeeks.org/problems/maximum-value--170645/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions





 ArrayList<Integer> maximumValue(Node node) {
       //code here
       ArrayList<Integer>ans = new ArrayList<>();
       Queue<Node>q = new LinkedList<>();
       q.add(node);
       while(!q.isEmpty()){
           int size = q.size();
           int max = Integer.MIN_VALUE;
           for(int i =0;i<size;i++){
               Node curr = q.poll();
               max = Math.max(max,curr.data);
               if(curr.left!=null)q.add(curr.left);
               if(curr.right!=null)q.add(curr.right);
           }
           ans.add(max);
       }
       return ans;
    }