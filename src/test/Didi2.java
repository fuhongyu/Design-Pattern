package test;

import java.util.Scanner;
import java.util.Stack;

public class Didi2 {	
	
	public static void test(int[] arr){
		Integer[] old = {1,2,3,4};
		Stack<Integer> stack = new Stack<Integer>();
		int arrIndex = 0;
		for (int i = 0; i < old.length; i++) {
			stack.push(old[i]);
			while(!stack.isEmpty() && stack.peek() == arr[arrIndex]){
				stack.pop();
				arrIndex++;
			}
		}
		if(stack.isEmpty()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		test(arr);
	}
}
