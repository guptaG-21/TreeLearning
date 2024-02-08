link->https://www.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


class pair{
    int hd;
    Node node;
    pair(int hd,Node node){
        this.hd = hd;
        this.node = node;
    }
}
class Solution
{
    
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        Queue<pair> q = new LinkedList<>();
        Map<Integer,ArrayList<Integer>>map = new TreeMap<>();
        q.add(new pair(0,root));
        
        while(!q.isEmpty()){
            pair p = q.poll();
            int hdVal = p.hd;
            Node curr = p.node;
            map.putIfAbsent(hdVal,new ArrayList<>());
            map.get(hdVal).add(curr.data);
            if(curr.left!=null){
                q.add(new pair(hdVal-1,curr.left));
            }
            if(curr.right!=null){
                q.add(new pair(hdVal+1,curr.right));
            }
        }
        
        ArrayList<Integer>ans = new ArrayList<>();
        for(ArrayList<Integer>nod : map.values()){
            ans.addAll(nod);
        }
        return ans;
    }
}