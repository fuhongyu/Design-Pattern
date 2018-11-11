package simple.factory.pattern1;

public class ChartFactroy {
	public static Chart getChart(String type){
		Chart chart = null;
		if(type.equalsIgnoreCase("histogram")){
			chart = new HistogramChart();
		}else if (type.equalsIgnoreCase("pie")){
			chart = new PieChat();
		}else if(type.equalsIgnoreCase("line")){
			chart = new LineChart();
		}else{
			System.out.println("can't find a class to create!");
		}
		return chart;
	}

}
