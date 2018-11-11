package test;

import java.awt.List;

class Node{
	int value;
	Node next;
	Node(int value){
		this.value = value;
	};
}

public class List1024 {
	
	public static void main(String[] args) {
		//��Ȼ��bug ������д���Ե�����
		Node head = new Node(1);
		Node h1 = new Node(2);
		Node h2 = new Node(3);
		Node h3 = new Node(2);
		Node h4 = new Node(1);
		head.next =h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		System.out.println(checkPalindrome(head));
	}
	public static Boolean checkPalindrome(Node list){
		Boolean result = false;
		Node quick = list, slow = list;
		Node pre = null;
		Node cur = list;
		while(quick.next!=null && quick.next.next!=null){
			//��ת����
			Node next = slow.next;
			cur.next = pre;
			pre = cur;
			cur = next;
			
			//ָ����ǰ����
			slow = slow.next;
			quick = quick.next.next;
		}
		//slow�����м�
		if(quick.next==null){
			Node left = cur.next; //��
			Node right = slow.next;  //��
			result = check(left, right);
		}else{
			//slow��ƫ���λ��
			Node left = cur;  //��
			Node right = slow.next;  //��
			//�����ж��Ƿ�ȫ�����
			result = check(left, right);					
		}	
		return result;
	}
	
	//�ж����������Ƿ���ȫ���
	public static Boolean check(Node n1, Node n2){
		while(n1!=null && n2!=null){
			if(n1.value!=n2.value){
				return false;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		if(n1!=null || n2!=null){
			return false;
		}else{
			return true;
		}
	}
	
	//������ת
	public static Node getReverse(Node list){
		Node pre = null;
		Node head = null;
		Node cur = list;
		while(list!=null){
			Node next = list.next;
			if(next == null){
				head = cur;
			}
			cur.next = pre;
			pre = cur;
			cur = next;			
		}
		return head;
	}

}
