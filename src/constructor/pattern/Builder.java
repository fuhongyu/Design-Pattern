package constructor.pattern;

public abstract class Builder {
	protected Actor actor = new Actor();
	
	public abstract void buildName();
	
	public abstract void buildSex();
	
	public abstract void buildHairType();
	
	public Actor getActor(){
		return actor;
	}

}
