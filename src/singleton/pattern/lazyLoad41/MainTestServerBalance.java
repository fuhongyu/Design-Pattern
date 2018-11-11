package singleton.pattern.lazyLoad41;

public class MainTestServerBalance {
	public static void main(String[] args) {
		LoadBalance balance1 = LoadBalance.getInstance();
		LoadBalance balance2 = LoadBalance.getInstance();
		LoadBalance balance3 = LoadBalance.getInstance();
		LoadBalance balance4 = LoadBalance.getInstance();
		
		if(balance1==balance2 && balance2==balance3 && balance3==balance4){
			System.out.println("���ɵĸ��ؾ���������һ���ģ�����");
		}
		
		String server1 = "Server1";
		String server2 = "Server2";
		
		balance1.addServer(server1);
		balance1.addServer(server2);
		
		System.out.println("���͵���������"+balance1.getServer());
		System.out.println("���͵���������"+balance1.getServer());
	}

}
