package test;

import java.util.Arrays;

public class TestDemo {
	
	public static void main(String[] args) {
		test();
		Object[] a = new Object[10];
		Arrays.sort(a);
	
	}
	public static void test(){
		try{
			int a = 10/0;
			System.out.println("shuchu1");
			return ;
		}catch(Exception e){
			System.out.println("shuchu2");
			return ;
			
		}finally {
			System.out.println("finally");
		}
	}
}
