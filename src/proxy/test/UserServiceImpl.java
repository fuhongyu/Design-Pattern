package proxy.test;

public class UserServiceImpl implements UserService{

	@Override
	public String getName(int id) {
		System.out.println("getName����������");
		return "fuhongyu";
	}

	@Override
	public Integer getAge(int id) {
		System.out.println("getAge����������");
		return 18;
	}

}
