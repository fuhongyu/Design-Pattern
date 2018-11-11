package test;

/**
 * 
 * @author FHY
 * 爬楼梯问题
 *
 */
public class DynamicTest {
	public static void main(String[] args) {
		//对递归和非递归实现两种方法进行性能比较：
		long start = System.currentTimeMillis();
		getNums(30);
		long end1 = System.currentTimeMillis();
		System.out.println("非递归实现："+(end1-start));
		
		calculateCount(30,2);
		long end2 = System.currentTimeMillis();
	    System.out.println("递归实现:"+(end2-end1));
	}
	
	private static int calculateCount(int ladder, int maxJump) {		
	    int jump = 0;
	    if (ladder == 0) {
	        return 1;
	    }
	    if (ladder >= maxJump) {
	        // 剩下的楼梯大于最大可跳跃数
	        for (int i = 1; i <= maxJump; i++) {
	            jump += calculateCount(ladder - i, maxJump);
	        }
	    } else {
	        // 剩下的楼梯不足最大可跳跃数
	        jump = calculateCount(ladder, ladder);
	    }	    
	    return jump;
	}

	public static int getNums(int n){
		if(n==1||n==2){
			return n;
		}
		int f1 = 1;
		int f2 = 2;
		int temp;
		for(int i=3; i<=n; i++){
			temp = f2;
			f2 += f1;
			f1 = temp;
		}		
		long end = System.currentTimeMillis();
		return f2;
	}
}
