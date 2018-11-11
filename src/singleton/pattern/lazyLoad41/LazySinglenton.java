package singleton.pattern.lazyLoad41;

/*
 * ����ʽʵ��
 */
public class LazySinglenton {

	private static LazySinglenton instance = null;
	private LazySinglenton(){
		
	}
//	����һ��������getInstance��������synchronized�ؼ���
//	synchronized public static LazySinglenton getInstance(){
//		if(instance == null){
//			instance = new LazySinglenton();
//		}
//		return instance;
//	}
	
//	��������ֻ�Դ���������һ�м���synchronized�ؼ���
//	public static LazySinglenton getInstance(){
//		if(instance == null){
//			synchronized (LazySinglenton.class) {
//				instance = new LazySinglenton();
//			}	
//		}
//		return instance;
//	}
	
//	��������ʹ��˫���� ��instanceҪ��voliate����
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
	
//	�����ġ�ֱ�Ӽ��� IoDHDemo
}
