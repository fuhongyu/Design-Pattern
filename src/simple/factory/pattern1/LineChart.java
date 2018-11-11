package simple.factory.pattern1;

public class LineChart implements Chart{
	public LineChart(){
		System.out.println("init a line chart!");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a Line!");
	}

}
