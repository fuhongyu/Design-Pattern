package test;
/**
 * ɵɵ�Ĳ��� ���
 */
import java.lang.reflect.Array;
import java.util.Scanner;


public class BeiKeT1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		scan.nextLine();
		int count = 0;
		String eachLine = "";
		int X,A,C,Y,B,D;
		String[] resultStr = new String[lines];
		while(count<lines){
			eachLine = scan.nextLine();
			String[] eachStr = eachLine.split(" ");
			X = Integer.parseInt(eachStr[0]); //С��HP
			A = Integer.parseInt(eachStr[1]); //С��ʹ�Է���ʧ����
			C = Integer.parseInt(eachStr[2]); //С����ȴʱ��
			Y = Integer.parseInt(eachStr[3]); //С��HP
			B = Integer.parseInt(eachStr[4]); //С��ʹ�Է���ʧ����
			D = Integer.parseInt(eachStr[5]); //С����ȴʱ��
			String eachresult = getResult(X,A,C,Y,B,D);
			resultStr[count] = eachresult;
			count++;
		}
		
		for(int i=0; i<lines; i++){
			System.out.println(resultStr[i]);
		}
	}

	private static String getResult(int x, int a, int c, int y, int b, int d) {
		//��ʼ�ж�
		if(x<=0 && y<=0){
			return "TIE";
		}else if(x<=0){
			return "XIAOCHUN";
		}else if(y<=0){
			return "XIAOZHI";
		}
		//��ʼ����
		int zhiCount = (int) (Math.ceil((double)y/a)-1); //С����Ҫ��������
		int zhiTime = zhiCount*c; //С����Ҫ��ȴ��ʱ��
		
		int chunCount = (int) (Math.ceil((double)x/b)-1);//С����Ҫ�����Ĵ���		
		int chunTime = chunCount*d; //С����Ҫ��ȴ��ʱ��
		
		if(zhiTime == chunTime){
			return "TIE";
		}else if(zhiTime > chunTime){
			return "XIAOCHUN";
		}else{
			return "XIAOZHI";
		}
		
	}
}
