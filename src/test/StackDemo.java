package test;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[4];
		int i = 0;
		while(i<4){
			nums[i] = scan.nextInt();
			i++;
		}
		test(nums);
	}

	private static void test(int[] nums) {
		int[] queue = {1,2,3,4};
		Stack stack = new Stack();
		int index = 0;
		for(int i=0 ;i<queue.length; i++){
			stack.push(queue[i]);
			while(!stack.isEmpty() && (int)stack.peek()==nums[index]){
				stack.pop();
				index ++;
			}
		}
		if(stack.isEmpty()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
