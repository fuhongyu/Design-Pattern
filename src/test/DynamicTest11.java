package test;

public class DynamicTest11 {
	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		getStep(nums);
	}

	public static void getStep(int[] array){
		int left;
		int right;
		int n = array.length;
		int[] result = new int[n];
		int count = 0;
		for(int i=0; i<n; count++){
			left = i+1;  //最左
			right = i+array[i];  //最右
			for(int j=i+1; j<n && j<=i+array[i];j++){		
				if(j+array[j]>=right){
					right = j+array[j];  //找到跳的最远的数
					left = j;
					
					result[count] = j-i;
				}
			}
			i = left;
		}
		for(int k=0; k<count-1; k++){
			System.out.println(result[k]+" ");
		}
	}
}
