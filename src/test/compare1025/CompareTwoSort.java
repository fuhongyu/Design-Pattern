package test.compare1025;

import java.util.Random;

public class CompareTwoSort {
	public static void main(String[] args) {
		int[] nums = getNums(10000);
		/*
		 * 以下测试排序功能是否实现		 
		int[] bubblenums = bubbleSort(nums);
		System.out.println("冒泡排序结果：");
		for(int i=0; i<bubblenums.length; i++){
			System.out.println(bubblenums[i]);
		}
		int[] insertnums = insertSort(nums);
		System.out.println("插入排序结果：");
		for(int i=0; i<insertnums.length; i++){
			System.out.println(insertnums[i]);
		}
		*/
		
		/*
		 * 以下测试两种排序算法的时间差异
		 */
		bubbleSort(nums);
		insertSort(nums);
		
	}
	
	public static int[] getNums(int n){
		int[] nums = new int[n];
		for(int i=0; i<n; i++){
			nums[i] = new Random().nextInt(n);
		}
		return nums;
	}
	
	public static int[] bubbleSort(int[] nums){
		long start = System.currentTimeMillis();
		int temp;
		boolean flag;
		for(int i=0; i<nums.length; i++){
			flag = false;
			for(int j=0; j<nums.length-i-1; j++){
				if(nums[j]>nums[j+1]){
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		long end = System.currentTimeMillis();
		System.out.println("冒泡排序耗时："+(end-start));
		return nums;
	}
	
	public static int[] insertSort(int[] nums){
		long start = System.currentTimeMillis();
		int value;
		for(int i=1; i<nums.length; i++){
			value = nums[i];
			int j = i-1;
			for(; j>=0; j--){
				if(nums[j]>value){
					nums[j+1] = nums[j];
				}else{
					break;
				}				
			}
			nums[j+1] = value;
		}
		long end = System.currentTimeMillis();
		System.out.println("插入排序算法耗时："+(end-start));
		return nums;
	}

}
