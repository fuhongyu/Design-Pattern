package factory.method.pattern2;

public class DatabaseLoggerFactory extends LoggerFactory{
	Logger logger = null;
	@Override
	public Logger createLoggerEntity() {
		System.out.println("�������ݿ���־���󡣡���");
		logger = new DatabaseLogger();
		return logger;
	}

}
