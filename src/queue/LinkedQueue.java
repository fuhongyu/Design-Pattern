package queue;
/*
 * ��ʽ���е�ʵ��
 * fhy
 */

public class LinkedQueue {
	
	private class Node{
		private String val;
		private Node next;
		public Node(String val, Node next){
			this.val = val;
			this.next = next;
		}
	}
		
	private Node head = null;
	private Node tail = null;
		
	//���
	public void enqueue(String item){	
		if(head == null) {
			Node newNode = new Node(item, null);
			head = newNode;
			tail = newNode;
		}else{
			tail.next = new Node(item, null);
			tail = tail.next;
		}
	}
	
	//����
	public String dequeue(){
		if(head == null){
			return null;
		}else{
			String value = head.val;
			head= head.next;
			return value;
		}
	}

}
