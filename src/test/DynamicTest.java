package test;

/**
 * 
 * @author FHY
 * ��¥������
 *
 */
public class DynamicTest {
	public static void main(String[] args) {
		//�Եݹ�ͷǵݹ�ʵ�����ַ����������ܱȽϣ�
		long start = System.currentTimeMillis();
		getNums(30);
		long end1 = System.currentTimeMillis();
		System.out.println("�ǵݹ�ʵ�֣�"+(end1-start));
		
		calculateCount(30,2);
		long end2 = System.currentTimeMillis();
	    System.out.println("�ݹ�ʵ��:"+(end2-end1));
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
