package bridge.pattern;

public class LinuxImp implements ImageImp{

	@Override
	public void paint(Matrix x) {
		System.out.println("在Linux操作系统中显示！");
	}

}
