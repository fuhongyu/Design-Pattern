package proxy.pattern5;

public class MainTest {
	public static void main(String[] args) {
		try {
//			ͨ�����䴴������
			Class c = Class.forName("proxy.pattern5.ProxySearcher");
			ProxySearcher searcher = (ProxySearcher) c.newInstance();
			searcher.doSearch("fhy", "123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
