link->https://www.geeksforgeeks.org/problems/sum-tree/1?page=1&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions




boolean isSumTree(Node node)
	{
	    int ans = treeStruct(node);
	    return ans!=-1;
	    
	}
	int treeStruct(Node node){
	    if(node == null)return 0;
	    if(node.left == null && node.right == null)return node.data;
	    int left = treeStruct(node.left);
	    int right = treeStruct(node.right);
	    if(left == -1 || right == -1 || (left+right) != node.data)return -1;
	    
	    return node.data + left + right;
	}