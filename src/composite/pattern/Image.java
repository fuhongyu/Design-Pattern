package composite.pattern;

public class Image extends Component{

	String name;
	public Image(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("�Բ���֧�ָ÷�����");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("�Բ���֧�ָ÷�����");
		
	}

	@Override
	public Component get(int i) {
		// TODO Auto-generated method stub
		System.out.println("�Բ���֧�ָ÷�����");
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("!!!��ͼƬ"+name+"����ɱ��");
	}

}
