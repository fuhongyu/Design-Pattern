package test;

import java.util.Scanner;
public class Test11{
	public static void main(String[] args) {
		//���ܼ�������
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] numArray = num.split(" ");
        int[] nums = new int[numArray.length];
        //����������ת����int
        for(int i= 0 ;i< numArray.length ;i++) {
        	nums[i] = Integer.parseInt(numArray[i]);
        }
        //��������
        getArray(nums); 
	}
	
	public static void getArray(int[] nums){
		//�������鳤��<=2,��һ�����
		if(nums.length<=2){
			System.out.println("1");
		}
        int n = nums.length;
        int count = 0;
        int left;	//��߽�		������������ʼλ��
        int right;	//�ұ߽�		������������ֹλ��
        int[] result = new int[n];
        for(int i = 0 ; i<n && nums[i]!= 0 ; count++) { //����������Ԫ��
        	right = i + nums[i];  //����
        	left = i + 1;  //����
        	for(int j= i+1 ;j< n && j<=i + nums[i] ;j++) {	
        		if(j+nums[j] >= right){	//�����ɵ���λ�� �ܵ������Զλ��
        			right = j+ nums[j];	//�������ұ߽�
        			left = j;  
        			result[count]=j-i;  //������������ÿһ�㣬�õ�һ��ֵ�ŵ�result������
        		}       		
        	}
        	i = left;	//��߽�           
        }
        for(int k=0; k<count-1;k++){
        	System.out.print(result[k]+" ");
        }
	}
}