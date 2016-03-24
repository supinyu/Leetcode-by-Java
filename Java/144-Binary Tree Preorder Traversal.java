/*
思路：先序遍历，非递归版，使用栈，先序遍历，顺序根，左结点，右结点
1、定义一个链表做返回值，定义一个栈，压入第一个值，头结点
2、从stack中弹出栈顶结点，记为cur，将cur的值add到链表，在判断cur的右孩子先压入stack，然后在判断cur的左孩子
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        if(root==null){
            return arrlist;
        }
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode temp=stack.pop();
            arrlist.add(temp.val);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        return arrlist;
        
    }
}