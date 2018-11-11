package factory.method.pattern2;

/*
 * 打印数据库日志的实现类
 */
public class DatabaseLogger implements Logger{

	@Override
	public void writeLogs() {
		// TODO Auto-generated method stub
		System.out.println("数据日志的输出。。。");
	}

}
