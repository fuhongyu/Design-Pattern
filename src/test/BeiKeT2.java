package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author FHY
 *
 * 简单表达式计算
 */

public class BeiKeT2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		line = line+"#"; //判断结尾
		char[] lineChar = line.toCharArray();		
		int result = getCompute(lineChar);
		
	}
		
	private static int getCompute(char[] lineChar) {
		Stack<String> original = new Stack<String>();
		Stack<Integer> back = new Stack<Integer>();
		ArrayList<Character> opeList = new ArrayList<Character>();		
		StringBuffer eachNum = new StringBuffer() ; 
		
		for(int i=0; i<lineChar.length; i++){	
			if(lineChar[i]=='#'){
				System.out.println(eachNum.toString());
				original.push(eachNum.toString());
			}else if(lineChar[i]!='+' && lineChar[i]!='-'){
				eachNum.append(lineChar[i]);				
			}else{
				System.out.println(eachNum.toString());
				original.push(eachNum.toString());
				opeList.add(lineChar[i]);
				eachNum = new StringBuffer();
			}		
		}
		while(!original.isEmpty()){
			if(original.peek().startsWith("0x")){
				back.push(Integer.parseInt(original.pop().substring(2),16));
			}else if(original.peek().startsWith("0")){
				back.push(Integer.parseInt(original.pop().substring(1),8));
			}else{
				back.push(Integer.parseInt(original.pop()));
			}
			
		}
		int sum = back.pop();
		int count = 0;
		while(!back.isEmpty() && count<opeList.size()){
			sum = (Character)opeList.get(count)=='+' ? back.pop()+sum : sum-back.pop();
			count++;
		}
		return sum;		
	}



	//八进制转十进制
	public static int Oto10(String str){
		int num = Integer.parseInt(str);
		int length = str.length();
		int temp[] = new int[length];
        int result = 0;
        for(int j=0;j < length;j++){
            temp[j] = (num/power(10,length-j-1))%power(10,1);
            result += temp[j]*power(8,length-j-1);
        }
		return result;
	}
	        
    private static int power(int i, int j) {
        int temp = 1;
        for(int k=0;k<j;k++){
            temp *= i;
        }
        return temp;
    }

}
