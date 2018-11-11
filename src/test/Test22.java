
package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		//获取键盘输入
		Scanner scan = new Scanner(System.in);
		String names = scan.nextLine();
		String[] nameArray = names.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int i = 0,k=0;
		String line;
		String[] lineSplit;	
		int sum = 0;
		int max = 0;
		int[] moneyArray = null ;
		while(i<nameArray.length){
			line = scan.nextLine();
			if(!"".equals(line)){
				System.out.println("aaa");
				lineSplit = line.split(" ");
				sum+=Integer.parseInt(lineSplit[1]); //总共花费
				max = max>Integer.parseInt(lineSplit[1])?max:Integer.parseInt(lineSplit[1]);  //最大花费
				moneyArray[k++] = Integer.parseInt(lineSplit[1]);//存储每一个花费的钱
				map.put(lineSplit[0], Integer.parseInt(lineSplit[1]));				
			}
			i++;		
		}	
		Arrays.sort(moneyArray); //降序排序
		
		//计算得分
		sum = (int) Math.floor(sum/nameArray.length);
		int eachpay = sum;
		for(int j=0; j<nameArray.length;j++){
			if(map.get(nameArray[j])!=null){
				
			}
		}
		
	}
	
	public static int getMax(HashMap map){
		int max = 0;
		for(int i=0 ; i<map.size(); i++){
			max = map. 
		}
	}

}









