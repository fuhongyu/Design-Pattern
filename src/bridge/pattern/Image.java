package bridge.pattern;


public abstract class Image {
	protected ImageImp imp;
	
	public void setImageImp(ImageImp imp){ //������ʾ��ͼƬ����
		this.imp = imp;		
	}
	
	public abstract void setFileName(String filename);
}
