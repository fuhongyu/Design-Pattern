package singleton.pattern.lazyLoad41;

public class MainTestServerBalance {
	public static void main(String[] args) {
		LoadBalance balance1 = LoadBalance.getInstance();
		LoadBalance balance2 = LoadBalance.getInstance();
		LoadBalance balance3 = LoadBalance.getInstance();
		LoadBalance balance4 = LoadBalance.getInstance();
		
		if(balance1==balance2 && balance2==balance3 && balance3==balance4){
			System.out.println("生成的负载均衡器都是一样的！！！");
		}
		
		String server1 = "Server1";
		String server2 = "Server2";
		
		balance1.addServer(server1);
		balance1.addServer(server2);
		
		System.out.println("发送到服务器："+balance1.getServer());
		System.out.println("发送到服务器："+balance1.getServer());
	}

}
