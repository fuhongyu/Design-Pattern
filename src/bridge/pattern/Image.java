package bridge.pattern;


public abstract class Image {
	protected ImageImp imp;
	
	public void setImageImp(ImageImp imp){ //设置显示的图片类型
		this.imp = imp;		
	}
	
	public abstract void setFileName(String filename);
}
