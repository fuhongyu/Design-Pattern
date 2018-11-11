package bridge.pattern;

public class JpgImage extends Image{

	@Override
	public void setFileName(String filename) {
		Matrix x = new Matrix();
		imp.paint(x);
		System.out.println(filename + ".jpgÀàĞÍµÄÍ¼Æ¬");
	}

}
