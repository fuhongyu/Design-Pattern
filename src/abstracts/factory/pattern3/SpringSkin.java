package abstracts.factory.pattern3;

public class SpringSkin implements Skin{

	@Override
	public Button getButton() {
		return new SpringButton();
	}

	@Override
	public TextField getTextField() {
		return new SpringTextField();
	}

}
