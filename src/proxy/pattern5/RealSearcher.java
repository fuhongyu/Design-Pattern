package proxy.pattern5;

public class RealSearcher extends Searcher{

	@Override
	public void doSearch(String userName, String password) {
		System.out.println(userName+"用户使用具体密码："+password+"进行登陆");
	}
	

}
