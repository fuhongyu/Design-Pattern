package test.compare1025;

public class QuickSortDemo {
	public static void main(String[] args) {
//		int n = 10;
		int[] nums = {3,2,4,16,65,4,2,7,37,4};
		quickSort(nums, nums.length);
		for(int i = 0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	private static void quickSort(int[] nums, int n) {
		quickSortPartition(nums, 0, n-1);
	}
	
	private static void quickSortPartition(int[] nums, int i, int n) {
		if(i<=n) return;
		int p = partition(nums, i, n);
		quickSortPartition(nums, 0, p-1);
		quickSortPartition(nums, p+1, n);
	}
	
	private static int partition(int[] nums, int q, int r) {
		int privot = nums[r];
		int i = q;
		int temp;
		for(int j = q; j < r; j++){
			if(nums[j]<privot){
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
			}		
		}
		return i;
	}

	

}
