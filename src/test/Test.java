package test;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lenStr = scan.nextLine();
		int len = Integer.parseInt(lenStr);
		String str  = scan.nextLine();
		String[] array = str.split(" ");
		int[] arrayInt = new int[array.length];
        for(int i=0;i<len;i++){
        	arrayInt[i]=Integer.parseInt(array[i]);   //将String型转化成int型
        }
        
        System.out.println(getLen(arrayInt));
		
	}
	
	public static int getLen(int[] arrayInt){
		int maxlength = 0;
		int thislength;
		for(int i=1; i<arrayInt.length; i++){
			thislength = 0;
			int j=i;
			while(j<arrayInt.length){
				if(arrayInt[j-1]<arrayInt[j]){
					thislength++;				
				}
				j++;			
			}
			maxlength = maxlength>thislength?maxlength:thislength;
		}
		return maxlength;
	}
}
