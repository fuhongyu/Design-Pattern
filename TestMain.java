package composite.pattern;
/**
 * 
 * @author FHY
 *	���ģʽ��ʵ��
 *	���ģʽ��Ϊ��ȫģʽ��͸��ģʽ
 */
public class TestMain {
	public static void main(String[] args) {
		Component folder = new Folder("ͼƬĿ¼");
		Component image1 = new Image("�������ͼƬ");
		folder.add(image1);
		folder.operation();
		folder.getresource();
		
	}
}
