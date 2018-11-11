package flyweight.pattern;

/**
 * 
 * @author FHY
 *	客户端测试代码
 */
public class ClientTest {
	public static void main(String[] args) {
		IgoChessFactory factory = IgoChessFactory.getInstance();
		IgoChessMan white1 = factory.getIgoInstance("w");
		IgoChessMan white2 = factory.getIgoInstance("w");
		IgoChessMan black1 = factory.getIgoInstance("b");
		IgoChessMan black2 = factory.getIgoInstance("b");
		System.out.println("两个白色棋子是否相同："+(white1==white2));
		System.out.println("两个黑色棋子是否相同："+(black1==black2));
		
		white1.display(new Position(1, 2));
		white2.display(new Position(5, 6));
		
		black1.display(new Position(11, 22));
		black2.display(new Position(55, 66));
	}

}
