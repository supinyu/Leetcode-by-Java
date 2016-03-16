/*
思路：
1、注意边界条件的建立，写的时候需要提前构建好测试用例
2、如果输入为空怎么样，直接退出
3、暴力匹配
控制条件，两层循环第一层控制目标串移动的位置
第二层循环控制匹配串的位置

*/
public class Solution {
    public int strStr(String haystack, String needle) {
		if(haystack==null || needle==null)
			return -1;
		for(int i=0;i<haystack.length()-needle.length()+1;i++){
			int j=0;
			for(j=0;j<needle.length();j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					break;
				}
			}
			if(j==needle.length())
				return i;
		}
		return -1;    
    }
}