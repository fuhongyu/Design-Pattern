package test;

import java.util.Scanner;

/**
 * 
 * @author FHY
 * time complicity : O(nlog(n))
 * spatial complicity : 0(n)
 * 1��дһ���۰����
 * 2���½�һ�����飬������������飬�ж������Ԫ�ر����������һ��Ԫ�ش�ֱ�ӷ������飬�����۰���Ҵ洢λ�ã����д洢
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();   //insert array's length
        int[] arr = new int[len];   
        sc.nextLine();
        String s = sc.nextLine();  //insert array
        String[] arrs = s.split(" ");
        for(int i=0;i< len;i++){   //transform array format
            arr[i] = Integer.parseInt(arrs[i]);
        }
        System.out.println(getMaxLength(arr, len));
        
	}

	public static int getMaxLength(int[] array, int numsize){
		if(numsize<2){
			return numsize;
		}
		
		int[] store = new int[numsize];  //define new array to store sorted array
		store[0] = array[0];
		int length = 1;
		int position; // the result of halfSearch
	    for(int i=1; i<numsize; i++){
	    	if(array[i]>store[length-1]){
	    		store[length++] = array[i];	    		
	    	}else{
	    		position = halfSearch(store, array[i], length); //find the position to store this element
	    		System.out.println(position);
	    		store[position] = array[i];
	    	}
	    }
	    return length;
	}
	public static int halfSearch(int[] array, int key, int length){
		int left = 0;
		int right = length-1;
		int middle = 0;
		while(left<right){
			middle = left + (right-left)/2;
			if(array[middle]>key){
				right = middle-1;
			}else if(array[middle]<key){
				left = middle+1;
			}else{
				return middle;
			}	
		}
		return left;
	}

}
