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
		//仍然有bug ，不会写测试的输入
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
			//反转链表
			Node next = slow.next;
			cur.next = pre;
			pre = cur;
			cur = next;
			
			//指针向前滑动
			slow = slow.next;
			quick = quick.next.next;
		}
		//slow在正中间
		if(quick.next==null){
			Node left = cur.next; //左
			Node right = slow.next;  //右
			result = check(left, right);
		}else{
			//slow在偏左的位置
			Node left = cur;  //左
			Node right = slow.next;  //右
			//依次判断是否全部相等
			result = check(left, right);					
		}	
		return result;
	}
	
	//判断两个链表是否完全相等
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
	
	//单链表反转
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
