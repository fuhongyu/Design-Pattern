package factory.method.pattern2;

public class MainTest2 {
	
	public static void main(String[] args) {
		LoggerFactory factory;
		factory= (LoggerFactory) XMLUtil2.getBean();		
		factory.writeLogs();
	}

}
