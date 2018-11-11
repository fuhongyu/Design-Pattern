package test;

public class JumpGame {
	public static void main(String[] args) {
		
	
	}
	
	public static boolean ifAccess(int[] nums){
		int i = 0;
		int j = 0;
		for(i=0; i<nums.length; i++){
			if(i+nums[i]>=nums.length-1){
				return true;
			}
			
				
			j = Math.max(j, i+nums[i]);
			i++;
		}
	}
}
