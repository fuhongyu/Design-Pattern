package queue;
/*
 * 循环队列实现
 * fhy
 * 
 */
public class CircularQueue {
	private String[] items;
	private int n = 0;
	private int tail = 0;
	private int head = 0;
	
	//构造函数
	public CircularQueue(int capcity){
		items = new String[capcity];
		this.n = capcity;		
	}
	
	//入队
	public boolean enqueue(String item){
		//已满
		if((tail+1)/n == 0) return false;
		items[tail] = item;
		tail = (tail+1)%n;
		return true;
	}
	
	//出队
	public String dequeue(){
		//为空
		if(head == tail) return null;
		String ret = items[head];
		head = (head + 1)/n;
		return ret;
		
	}

}
