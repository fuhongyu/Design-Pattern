package test.compare1025;

import java.util.Random;

public class CompareTwoSort {
	public static void main(String[] args) {
		int[] nums = getNums(10000);
		/*
		 * ���²����������Ƿ�ʵ��		 
		int[] bubblenums = bubbleSort(nums);
		System.out.println("ð����������");
		for(int i=0; i<bubblenums.length; i++){
			System.out.println(bubblenums[i]);
		}
		int[] insertnums = insertSort(nums);
		System.out.println("������������");
		for(int i=0; i<insertnums.length; i++){
			System.out.println(insertnums[i]);
		}
		*/
		
		/*
		 * ���²������������㷨��ʱ�����
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
		System.out.println("ð�������ʱ��"+(end-start));
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
		System.out.println("���������㷨��ʱ��"+(end-start));
		return nums;
	}

}
