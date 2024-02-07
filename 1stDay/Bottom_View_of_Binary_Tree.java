link->https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


class Solution
{
    class pair{
        int hd;
        Node val;
        pair(int hd,Node val){
            this.hd = hd;
            this.val = val;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair(0,root));
        HashMap<Integer,Integer> mp = new HashMap<>();
        int min=0;
        int max = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                pair curr = q.poll();
                min = Math.min(min,curr.hd);
                max = Math.max(max,curr.hd);
                mp.put(curr.hd,curr.val.data);
                if(curr.val.left!=null){
                    q.add(new pair(curr.hd-1,curr.val.left));
                }
                if(curr.val.right!=null){
                    q.add(new pair(curr.hd+1,curr.val.right));
                }
                size--;
            }
        }
        ArrayList<Integer>ans = new ArrayList<>();
        while(min != max+1){
            ans.add(mp.get(min));
            min++;
        }
        return ans;
    }