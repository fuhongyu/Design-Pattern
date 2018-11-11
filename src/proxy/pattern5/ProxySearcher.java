package proxy.pattern5;

public class ProxySearcher extends Searcher{
	private RealSearcher realSearcher = new RealSearcher();
	private AccessValidate validate;
	private Logger logger;
	
	@Override
	public void doSearch(String userName, String password) {
		if(this.doValidate(userName, password)){
			realSearcher.doSearch(userName, password);
			this.doLog(userName);
		}
	}
	
	public boolean doValidate(String userName, String password){
		validate = new AccessValidate();
		if(validate.isValidate(userName, password)){
			return true;
		}else{
			return false;
		}
	}
	
	public void doLog(String userName){
		logger = new Logger();
		logger.doLog(userName);
	}

}
