package bridge.pattern;

public class PngImage extends Image{

	@Override
	public void setFileName(String filename) {
		Matrix x = new Matrix();
		imp.paint(x);
		System.out.println(filename + ".pngÀàĞÍµÄÍ¼Æ¬");
	}
	

}
