package test;

import java.util.Scanner;
/**
 * 
 * @author FHY
 * time complicity : O(n^2)
 * spatial complicity : O(1)
 *
 */

public class Test01 {
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
        System.out.println(getMax(len,arr));
    }

    public static int getMax(int len,int[] nums) {
        if(len < 2 )
            return len;
        int dp[] = new int[len];  //define array to store smaller than this element
        dp[0] = 1;
        int maxlength = 1;  //the max length of ascending array
        for(int i=1 ; i<len ;i++){
            int thismax = 0;
            for(int j=0 ; j<i ; j++){
                if(nums[j] <= nums[i]){
                    thismax = Math.max(dp[j],thismax);
                }
            }
            dp[i] = thismax + 1;
            maxlength = Math.max(maxlength,dp[i]);
        }
        return maxlength;
    }
}
