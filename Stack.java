package com.bridgelab.stack.day14;

public class StackClass {

	static class stack { 
		
		public static Node head ;
		public static boolean isEmpty() {
			return head==null;
			
		}
		 // push the Element
		public static void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		//pop the Element
		public static int pop() {
			if(isEmpty()) {
				return -1;
				
			}
			
			int top = head.data;
			head = head.next;
			return top;
		}
		
		//peek 
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
		
	}
	public static void main(String[] args) {
		
		stack s = new stack();
		s.push(56);
		s.push(30);
		s.push(70);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		

	}

}