package factory.method.pattern2;

/*
 * ��ӡ�ļ���־��ʵ����
 */

public class FileLoggerFactory extends LoggerFactory {
	Logger logger = null;

	@Override
	public Logger createLoggerEntity() {
		System.out.println("�����ļ���־���󡣡���");
		logger = new FileLogger();
		return logger;
	}

	
}
