package bridge.pattern;

public class UnixImp implements ImageImp {

	@Override
	public void paint(Matrix x) {
		System.out.println("在Unix操作系统中显示！");
	}

}
