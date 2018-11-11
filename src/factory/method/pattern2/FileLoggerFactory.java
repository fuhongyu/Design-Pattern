package factory.method.pattern2;

/*
 * 打印文件日志的实现类
 */

public class FileLoggerFactory extends LoggerFactory {
	Logger logger = null;

	@Override
	public Logger createLoggerEntity() {
		System.out.println("创建文件日志对象。。。");
		logger = new FileLogger();
		return logger;
	}

	
}
