package factory.method.pattern2;

/*
 * 创建日志的抽象工厂类
 */
public abstract class LoggerFactory {
	public void writeLogs(){
		Logger logger = this.createLoggerEntity();
		logger.writeLogs();		
	}
	public abstract Logger createLoggerEntity();

}
