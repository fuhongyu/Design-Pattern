package composite.pattern;
/**
 * 
 * @author FHY
 *	组合模式的实现
 *	组合模式分为安全模式和透明模式
 */
public class TestMain {
	public static void main(String[] args) {
		Component folder = new Folder("图片目录");
		Component image1 = new Image("付红玉的图片");
		folder.add(image1);
		folder.operation();
		folder.getresource();
		
	}
}
