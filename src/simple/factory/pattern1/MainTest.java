package simple.factory.pattern1;

public class MainTest {
	public static void main(String[] args) {
		String chartType = XMLUtil.getChartType();
		System.out.println(chartType);
		ChartFactroy factroy = new ChartFactroy();
		Chart chart = factroy.getChart(chartType);
		chart.display();
	}

}
