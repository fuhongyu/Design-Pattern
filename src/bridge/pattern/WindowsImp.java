package bridge.pattern;

public class WindowsImp implements ImageImp{

	@Override
	public void paint(Matrix x) {
		System.out.println("在Windows操作系统中显示！");
	}

}
