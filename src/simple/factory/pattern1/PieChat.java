package simple.factory.pattern1;

public class PieChat implements Chart {
	public PieChat(){
		System.out.println("this is a pie chart!");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a pie!");
	}

}
