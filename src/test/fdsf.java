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
	        // ʣ�µ�¥�ݴ���������Ծ��
	        for (int i = 1; i <= maxJump; i++) {
	            jump += calculateCount(ladder - i, maxJump);	           
	        }
	    } else {
	        // ʣ�µ�¥�ݲ���������Ծ��
	        jump = calculateCount(ladder, ladder);	        
	    }
	    return jump;
	}

}
