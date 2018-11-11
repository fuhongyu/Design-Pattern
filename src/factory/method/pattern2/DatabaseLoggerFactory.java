package factory.method.pattern2;

public class DatabaseLoggerFactory extends LoggerFactory{
	Logger logger = null;
	@Override
	public Logger createLoggerEntity() {
		System.out.println("创建数据库日志对象。。。");
		logger = new DatabaseLogger();
		return logger;
	}

}
