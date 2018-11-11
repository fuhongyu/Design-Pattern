package singleton.pattern.lazyLoad41;

/*
 * 懒汉式实现
 */
public class LazySinglenton {

	private static LazySinglenton instance = null;
	private LazySinglenton(){
		
	}
//	方法一：对整个getInstance方法加上synchronized关键字
//	synchronized public static LazySinglenton getInstance(){
//		if(instance == null){
//			instance = new LazySinglenton();
//		}
//		return instance;
//	}
	
//	方法二、只对创建对象这一行加上synchronized关键字
//	public static LazySinglenton getInstance(){
//		if(instance == null){
//			synchronized (LazySinglenton.class) {
//				instance = new LazySinglenton();
//			}	
//		}
//		return instance;
//	}
	
//	方法三、使用双重锁 ，instance要用voliate定义
	public static LazySinglenton getInstance(){
		if(instance == null){
			synchronized (LazySinglenton.class) {
				if(instance==null){
					instance = new LazySinglenton();
				}				
			}	
		}
		return instance;
	}
	
//	方法四、直接见类 IoDHDemo
}
