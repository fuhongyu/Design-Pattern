package queue;
/*
 * ѭ������ʵ��
 * fhy
 * 
 */
public class CircularQueue {
	private String[] items;
	private int n = 0;
	private int tail = 0;
	private int head = 0;
	
	//���캯��
	public CircularQueue(int capcity){
		items = new String[capcity];
		this.n = capcity;		
	}
	
	//���
	public boolean enqueue(String item){
		//����
		if((tail+1)/n == 0) return false;
		items[tail] = item;
		tail = (tail+1)%n;
		return true;
	}
	
	//����
	public String dequeue(){
		//Ϊ��
		if(head == tail) return null;
		String ret = items[head];
		head = (head + 1)/n;
		return ret;
		
	}

}
