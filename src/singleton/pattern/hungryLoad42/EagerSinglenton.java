package singleton.pattern.hungryLoad42;

/*
 * ¶öººÊ½ÊµÏÖ
 */
public class EagerSinglenton {
	
	private static final EagerSinglenton instance = new EagerSinglenton();
	
	public static EagerSinglenton getInstance(){
		return instance;
	}
	
}
