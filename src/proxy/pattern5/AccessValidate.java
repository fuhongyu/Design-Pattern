package proxy.pattern5;

public class AccessValidate {
	public boolean isValidate(String userName, String userId){
		System.out.println("�����ݿ�������֤"+userName+"�Ƿ�ͨ����");
		if("fhy".equals(userName) && "123".equals(userId)){
			System.out.println(userName+"��֤ͨ��!");
			return true;
		}else {
			System.out.println(userName+"��֤ʧ�ܣ�");
			return false;
		}
	}

}
