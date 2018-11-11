package singleton.pattern.lazyLoad41;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class LoadBalance {
	
	private ArrayList serverlist ;
	private static LoadBalance balance = null;
	private LoadBalance(){
		serverlist = new ArrayList();
	}
	
	//获取负载均衡器的接口
	public static LoadBalance getInstance(){
		if(balance==null){
			balance = new LoadBalance();
		}
		return balance;
	}
	
	public void addServer(String server){
		serverlist.add(server);
	}
	
	public void removeServer(String server){
		serverlist.remove(server);
	}
	public String getServer(){
		Random random = new Random();
		int i = random.nextInt(serverlist.size());
		return (String) serverlist.get(i);
	}
}
