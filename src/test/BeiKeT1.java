package test;
/**
 * 傻傻的搏斗 解答
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
			X = Integer.parseInt(eachStr[0]); //小智HP
			A = Integer.parseInt(eachStr[1]); //小智使对方丢失点数
			C = Integer.parseInt(eachStr[2]); //小智冷却时间
			Y = Integer.parseInt(eachStr[3]); //小春HP
			B = Integer.parseInt(eachStr[4]); //小春使对方丢失点数
			D = Integer.parseInt(eachStr[5]); //小春冷却时间
			String eachresult = getResult(X,A,C,Y,B,D);
			resultStr[count] = eachresult;
			count++;
		}
		
		for(int i=0; i<lines; i++){
			System.out.println(resultStr[i]);
		}
	}

	private static String getResult(int x, int a, int c, int y, int b, int d) {
		//初始判断
		if(x<=0 && y<=0){
			return "TIE";
		}else if(x<=0){
			return "XIAOCHUN";
		}else if(y<=0){
			return "XIAOZHI";
		}
		//开始攻击
		int zhiCount = (int) (Math.ceil((double)y/a)-1); //小智需要攻击次数
		int zhiTime = zhiCount*c; //小智需要冷却的时间
		
		int chunCount = (int) (Math.ceil((double)x/b)-1);//小春需要攻击的次数		
		int chunTime = chunCount*d; //小春需要冷却的时间
		
		if(zhiTime == chunTime){
			return "TIE";
		}else if(zhiTime > chunTime){
			return "XIAOCHUN";
		}else{
			return "XIAOZHI";
		}
		
	}
}
