package abstracts.factory.pattern3;

public class MainTest {
	public static void main(String[] args) {
/*		直接创建一个皮肤，输出如下
		Skin skin = new SpringSkin();
		Button button = skin.getButton();
		TextField textField = skin.getTextField();
		button.display();
		textField.display();
*/
		
/*
		通过配置文件反射的方式创建输出如下：
*/
		Skin skin = (Skin) XMLUtil.getBean();
		Button button = skin.getButton();
		TextField textField = skin.getTextField();
		button.display();
		textField.display();
	}

}
