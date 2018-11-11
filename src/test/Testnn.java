package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Testnn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strs = str.split(" ");
		int numCount = Integer.parseInt(strs[0]);
		int change = Integer.parseInt(strs[1]);
		
		String numStr = scan.nextLine();
		String[] numsArr = numStr.split(" ");
		ArrayList numList = new ArrayList();
		
		for(int i=0;i<numsArr.length;i++){
			numList.add(Integer.parseInt(numsArr[i]));
		}
		
		System.out.println(sortNums(numList,change));
	}

	private static int sortNums(ArrayList nums,int change) {
		
		int thisFlag = 0;
		int min = (int) nums.get(0);
		int count = 0;
		while(count<change){
			min = (int) nums.get(nums.size()-1);
			for(int i=1;i<nums.size();i++){
				if(min>(int)nums.get(i)){
					min = (int)nums.get(i);
					thisFlag = i;					
				}				
			}
			
			if(thisFlag==0){
				nums.set(1, (int)nums.get(1)+(int)nums.get(0));
				nums.remove(0);
				count ++;
				continue;
			}else if(thisFlag==nums.size()-1){
				nums.set(nums.size()-2, (int)nums.get(nums.size()-1)+(int)nums.get(nums.size()-2));
				nums.remove(nums.size()-1);
				count++;
				continue;
			}
			
			if((int)nums.get(thisFlag-1)<(int)nums.get(thisFlag+1)){
				nums.set(thisFlag-1,(int)nums.get(thisFlag-1)+(int)nums.get(thisFlag));
				nums.remove(thisFlag);
			}else{
				nums.set(thisFlag+1,(int)nums.get(thisFlag+1)+(int)nums.get(thisFlag));
				nums.remove(thisFlag);
			}			
			count++;					
		}
		
		min = (int)nums.get(0);
		for(int i=1;i<nums.size();i++){
			if(min>(int)nums.get(i)){
				min = (int) nums.get(i);
			}		
		}
		return min;
	}
}
