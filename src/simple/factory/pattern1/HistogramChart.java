package simple.factory.pattern1;

public class HistogramChart implements Chart {
	public HistogramChart(){
		System.out.println("init a histogram Chart!");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a histogram!");
	}

}
