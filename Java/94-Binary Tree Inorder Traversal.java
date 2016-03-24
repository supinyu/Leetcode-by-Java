/*
中序遍历
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
		if(root==null){
			return arraylist;
		}
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(!stack.isEmpty() || root!=null){
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
				root=stack.pop();
				arraylist.add(root.val);
				root=root.right();
			}
		}
		return arraylist;
    }
}