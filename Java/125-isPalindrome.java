/*
思路：判断是否是回文字符串，主要的思路就是利用两个指针，一个在前一个在后
忽略其他字符，写一个循环在前面判断是否是数字还是字符
*/
public class Solution {
    public boolean isPalindrome(String s) {
		if(s==null){
			return false;
		}
        int i=0,j=s.length()-1;
		while(i<j){
			while(i<j&&!Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while(i<j&&!Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
				return false;
			}
			i++;
			j--;
		}
		return true;
    }
}