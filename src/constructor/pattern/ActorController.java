package constructor.pattern;

public class ActorController {
	public Actor constructor(Builder b){
		Actor actor ;
		b.buildName();
		b.buildSex();
		b.buildHairType();
		actor = b.getActor();
		return actor;
	}

}
