link->https://www.geeksforgeeks.org/problems/construct-tree-from-preorder-traversal/1?page=2&category=Tree&company=Amazon&difficulty=Medium&sortBy=submissions

int indx = 0;
    Node constructTree(int n, int pre[], char preLN[]){
	    // code here
	    if(indx>=n)return null;
	    
	    Node newNode = new Node(pre[indx]);
	    indx++;
	    if(preLN[indx-1] == 'N'){
	        newNode.left = constructTree(n,pre,preLN);
	        newNode.right = constructTree(n,pre,preLN);
	    }
	    return newNode;
    }