package flyweight.pattern;

/**
 * 
 * @author FHY
 *	������Ԫ��
 */

public abstract class IgoChessMan {
	public abstract String getColor();
	
	public void display(Position position){
		System.out.println("������ɫ��"+this.getColor()+"�����ǣ�"+
					position.getX()+";"+position.getY());
	}
	

}
