package flyweight.pattern;

/**
 * 
 * @author FHY
 *	�ͻ��˲��Դ���
 */
public class ClientTest {
	public static void main(String[] args) {
		IgoChessFactory factory = IgoChessFactory.getInstance();
		IgoChessMan white1 = factory.getIgoInstance("w");
		IgoChessMan white2 = factory.getIgoInstance("w");
		IgoChessMan black1 = factory.getIgoInstance("b");
		IgoChessMan black2 = factory.getIgoInstance("b");
		System.out.println("������ɫ�����Ƿ���ͬ��"+(white1==white2));
		System.out.println("������ɫ�����Ƿ���ͬ��"+(black1==black2));
		
		white1.display(new Position(1, 2));
		white2.display(new Position(5, 6));
		
		black1.display(new Position(11, 22));
		black2.display(new Position(55, 66));
	}

}
