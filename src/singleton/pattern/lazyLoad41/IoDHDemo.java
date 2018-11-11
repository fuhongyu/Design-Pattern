package singleton.pattern.lazyLoad41;
/*
 * IoDH Initialization Demand Holder (IoDH) 技术的实现，
 * 这是一个更好的单例方法
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
