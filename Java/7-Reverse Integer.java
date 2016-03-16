/*
细节题：主要抓住一些边界条件，比如说是最后一位是0怎么办，主要考察代码的实现能力
1、负数怎么办
2、最后一位为0怎么办
3、溢出怎么办
*/
public class Solution {
    public int reverse(int x) {
        long ret=0;
        while(x!=0){
        	ret = ret*10+x%10;
        	x=x/10;
        	if(Math.abs(ret)>2147483647){
        		return 0;
        	}
        }
        return (int)ret;
    }
}