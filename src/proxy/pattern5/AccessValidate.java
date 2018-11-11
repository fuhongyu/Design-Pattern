package proxy.pattern5;

public class AccessValidate {
	public boolean isValidate(String userName, String userId){
		System.out.println("在数据库中先验证"+userName+"是否通过！");
		if("fhy".equals(userName) && "123".equals(userId)){
			System.out.println(userName+"验证通过!");
			return true;
		}else {
			System.out.println(userName+"验证失败！");
			return false;
		}
	}

}
