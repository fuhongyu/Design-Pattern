package abstracts.factory.pattern3;

public class MainTest {
	public static void main(String[] args) {
/*		ֱ�Ӵ���һ��Ƥ�����������
		Skin skin = new SpringSkin();
		Button button = skin.getButton();
		TextField textField = skin.getTextField();
		button.display();
		textField.display();
*/
		
/*
		ͨ�������ļ�����ķ�ʽ����������£�
*/
		Skin skin = (Skin) XMLUtil.getBean();
		Button button = skin.getButton();
		TextField textField = skin.getTextField();
		button.display();
		textField.display();
	}

}
