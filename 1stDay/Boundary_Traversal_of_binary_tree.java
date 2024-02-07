link->https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions


ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    if(isLeaf(node)){
	        list.add(node.data);
	        return list;
	    }
	    if(!isLeaf(node)){
	        list.add(node.data);
	    }
	    LB(node,list);
	    leaves(node,list);
	    RB(node,list);
	    return list;
	}
	boolean isLeaf(Node node){
	    return node.left == null && node.right == null;
	}
	void leaves(Node node,ArrayList<Integer>al){
	    if(isLeaf(node)){
	        al.add(node.data);
	        return;
	    }
	    if(node.left!=null)leaves(node.left,al);
	    if(node.right!=null)leaves(node.right,al);
	}
	void LB(Node node,ArrayList<Integer>AL){
	    Node curr = node.left;
	    while(curr!=null){
	        if(!isLeaf(curr)){
	            AL.add(curr.data);
	        }
	        if(curr.left!=null){
	            curr =  curr.left;
	        }else{
	            curr = curr.right;
	        }
	    }
	}
	void RB(Node node,ArrayList<Integer>AL){
	    Node curr = node.right;
	    ArrayList<Integer> temp = new ArrayList<>();
	    while(curr!=null){
	        if(!isLeaf(curr)){
	            temp.add(curr.data);
	        }
	        if(curr.right!=null){
	            curr =  curr.right;
	        }else{
	            curr = curr.left;
	        }
	    }
	    for(int i=temp.size()-1;i>=0;i--){
	        AL.add(temp.get(i));
	    }
	}