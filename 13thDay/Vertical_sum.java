link->https://www.geeksforgeeks.org/problems/vertical-sum/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions




public ArrayList <Integer> verticalSum(Node root) {
        Map<Integer,Integer> hm = new TreeMap<>();
        ArrayList<Integer>ans = new ArrayList<>();
        mapping(root,0,hm);
        for(int nums:hm.values()){
            ans.add(nums);
        }
        return ans;
    }
    public void mapping(Node root,int dist,Map<Integer,Integer>mp){
        if(root == null)return;
        
        mp.put(dist,mp.getOrDefault(dist,0)+root.data);
        mapping(root.left,dist-1,mp);
        mapping(root.right,dist+1,mp);
    }