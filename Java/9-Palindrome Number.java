/*
思路：
1、首先判断边界条件，如果是类型中最大的数直接返回false
2、定义一个变量help，用于返回最前面的那个数，和最后面的数进行判断，如果相等去掉最前面的和最后面的继续循环
3、循环终止条件当num等于0时循环终止，返回true
*/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
		int help=1;
		//让help和x属于一个量级
		while(x/help>=10){
			help=help*10;
		}
		while(x!=0){
			if(x/help!=x%10){
				return false;
			}
			x=(x%help)/10;
			help=help/100;  //去掉了两位所以要除以100
		}
		return true;
    }
}