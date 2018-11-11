package singleton.pattern.lazyLoad41;
/*
 * IoDH Initialization Demand Holder (IoDH) ������ʵ�֣�
 * ����һ�����õĵ�������
 */
class IoDHDemo {
	private IoDHDemo(){}
	private static class HolderClass{
		private final static IoDHDemo instance = new IoDHDemo();
	}
	public static IoDHDemo getInstance(){
		return HolderClass.instance;
	}
	
	public static void main(String[] args) {
		IoDHDemo instance1 = IoDHDemo.getInstance();
		IoDHDemo instance2 = IoDHDemo.getInstance();
		System.out.println(instance1==instance2);
	}

}
