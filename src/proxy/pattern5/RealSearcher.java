package proxy.pattern5;

public class RealSearcher extends Searcher{

	@Override
	public void doSearch(String userName, String password) {
		System.out.println(userName+"�û�ʹ�þ������룺"+password+"���е�½");
	}
	

}
