package constructor.pattern;

public class PatternTest {
	public static void main(String[] args) {
		Builder b = new HeroBuilder();
		ActorController actor = new ActorController();
		Actor newactor = actor.constructor(b);
		System.out.println(newactor.getHairStyle());
		System.out.println(newactor.getName());
		System.out.println(newactor.getSex());
		
	}

}
