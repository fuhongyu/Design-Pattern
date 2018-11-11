package flyweight.pattern;

import java.util.Hashtable;
/**
 * 
 * @author FHY
 *	享元工厂类
 */
public class IgoChessFactory {
	private static IgoChessFactory instance = new IgoChessFactory();
	private static Hashtable<String,Object> ht ;
	
	public IgoChessFactory(){
		ht = new Hashtable<>();
		IgoChessMan black, white; 
		black = new BlackChessMan();
		ht.put("b", black);
		white = new WhiteChessMan();
		ht.put("w",white);
	} 
	
	public static IgoChessFactory getInstance(){
		return instance;
	}
	public static IgoChessMan getIgoInstance(String color){
		return (IgoChessMan)ht.get(color);
	}

}
