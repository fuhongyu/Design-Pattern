package bridge.pattern;

public class BridgeTest {
	public static void main(String[] args) {
		Image image = new JpgImage();
		ImageImp imp = new WindowsImp();
		image.setImageImp(imp);
		image.setFileName("¸¶ºìÓñÖ¤¼şÕÕ");
	}
}
