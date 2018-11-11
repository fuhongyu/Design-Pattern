package factory.method.pattern2;

/*
 * ������־�ĳ��󹤳���
 */
public abstract class LoggerFactory {
	public void writeLogs(){
		Logger logger = this.createLoggerEntity();
		logger.writeLogs();		
	}
	public abstract Logger createLoggerEntity();

}
