package queue;
/*
 * ˳�����
 */
public class ArrayQueue {
	private String[] items;
	private int n;
	private int head = 0;
	private int tail = 0;
	
	//���캯��
	public ArrayQueue(int capcity) {
		items = new String[capcity];
		this.n = capcity;
	}
	
	//���
	public boolean enqueue(String item){
		if(tail == n) return false;
		items[tail] = item;
		tail += 1;
		return true;
	}
	
	//����
	public String dequeue(){
		if(head == tail) return null;
		String ret = items[head];
		head += head;
		return ret;
	}

}
