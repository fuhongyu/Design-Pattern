package test;

import jdk.internal.dynalink.beans.StaticClass;

public class SqrtTest {
	public static void main(String[] args) {
		double num =4;
		System.out.println(newTonTest(num));
//		System.out.println(Math.sqrt(85));
//		double x = 85;
//		double root = newtonSqrt(x);
//		System.out.println(root);
//		double result = erfenSqrt(85);
//		System.out.println(result);
	}
	//使用牛顿法实现求平方根 
	static double newtonSqrt(double x) {
 
		if (x < 0) {
			System.out.println("负数没事开什么方");
			return -1;
		}
		if (x == 0)
			return 0;
 
		double _avg = x;
		double last_avg = Double.MAX_VALUE;
		final double _JINGDU = 1e-6;
 
		while (Math.abs(_avg - last_avg) > _JINGDU) {
			last_avg = _avg;
			_avg = (_avg + x / _avg) / 2;
		}
		return _avg;
	}
	
	/**
	 * 
	 * @param nums
	 * @return 
	 * 基于牛顿迭代法的公式: X[n+1] = (X[n] + nums/X[n])/2
	 * 每一个X[n+1]都比上一个X[n]更接近于解
	 */
	public static double newTonTest(double nums){
		double compare = Double.MAX_VALUE;
		double sqrt = nums;
		
		final double ACCURACY = 1e-6;
		while(Math.abs(compare-sqrt)>ACCURACY){
			compare = sqrt;
			sqrt = (sqrt+nums/sqrt)/2.0;
			System.err.println(sqrt);
		}
		return sqrt;
	}

	
	/**
	 * 
	 * @param num : 求平方根的数
	 * @return 平方根
	 * 思路：使用二分查找，每次取左右边界的中点计算比较，
	 * 		终止条件是左右边界之差小于要求的精度0.000001。
	 * 	
	 */
	private static double getSqrt(double num){
		if(num<0) 
			return -1;
		
		double low = Double.MIN_VALUE;
		double high = Double.MAX_VALUE;
		final double ACCURACY = 1e-6;		
		double mid = 0.0;
		double square ; 
		
		while(Math.abs(low-high) > ACCURACY){
			mid = low + (high-low)/2;
			square = mid * mid;
			
			if(square<num){ //说明要求的值在右半部分
				low = mid;
				
			}else{  //说明要求的值在左半部分
				high = mid;
			}			
		}
		return mid;
	}
	
	//使用二分法实现平方根
	static double erfenSqrt(double x) {
		 
		if (x < 0) {
			System.out.println("负数没事开什么方");
			return -1;
		}
		if (x == 0)
			return 0;
 
		final double _JINGDU = 1e-6;
		double _low = 0;
		double _high = x;
		double _mid = Double.MAX_VALUE;
		double last_mid = Double.MIN_VALUE;
 
		while (Math.abs(_mid - last_mid) > _JINGDU) {
 
			last_mid = _mid;
			_mid = (_low + _high) / 2;
			if (_mid * _mid > x)
				_high = _mid;
			if (_mid * _mid < x)
				_low = _mid;
 
		}
		return _mid;
 
	}

}
