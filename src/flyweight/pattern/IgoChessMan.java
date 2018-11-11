package flyweight.pattern;

/**
 * 
 * @author FHY
 *	抽象享元类
 */

public abstract class IgoChessMan {
	public abstract String getColor();
	
	public void display(Position position){
		System.out.println("棋子颜色："+this.getColor()+"坐标是："+
					position.getX()+";"+position.getY());
	}
	

}
