package composite.pattern;

import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Folder extends Component{
	ArrayList<Component> array = new ArrayList<Component>();
	String name;
	public Folder(String name) {
		this.name = name;
	}
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		array.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		array.remove(component);
	}

	@Override
	public Component get(int i) {
		// TODO Auto-generated method stub
		return array.get(i);
	}

	@Override
	public void operation() {
		System.out.println("~~~对文件夹"+name+"进行杀毒！");
		for (Object obj : array) {
			((Component)obj).operation();
		}
		
	}
	
	public int getresource(){
		System.out.println("22");
		return 2;
	}
	
	
	


}
