package proxy.test;

public class UserServiceImpl implements UserService{

	@Override
	public String getName(int id) {
		System.out.println("getName方法进来了");
		return "fuhongyu";
	}

	@Override
	public Integer getAge(int id) {
		System.out.println("getAge方法进来了");
		return 18;
	}

}
