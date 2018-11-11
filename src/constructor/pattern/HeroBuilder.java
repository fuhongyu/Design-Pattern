package constructor.pattern;

public class HeroBuilder extends Builder{

	
	@Override
	public void buildName() {
		// TODO Auto-generated method stub
		actor.setName("美少女战士");		
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("女孩");	
	}

	@Override
	public void buildHairType() {
		// TODO Auto-generated method stub
		actor.setHairStyle("黄色");		
	}

}
