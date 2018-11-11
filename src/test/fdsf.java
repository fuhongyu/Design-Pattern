package test;

public class fdsf {
	public static void main(String[] args) {
		System.out.println(calculateCount(10,3));
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

}
