package abstracts.factory.pattern3;

public class AutumnSkin implements Skin{

	@Override
	public Button getButton() {
		return new AutumnButton();
	}

	@Override
	public TextField getTextField() {
		return new AutumnTextField();
	}

}
