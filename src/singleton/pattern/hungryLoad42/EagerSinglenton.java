package singleton.pattern.hungryLoad42;

/*
 * ����ʽʵ��
 */
public class EagerSinglenton {
	
	private static final EagerSinglenton instance = new EagerSinglenton();
	
	public static EagerSinglenton getInstance(){
		return instance;
	}
	
}
