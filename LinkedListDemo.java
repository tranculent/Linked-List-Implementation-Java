
public class LinkedListDemo {
	static class Node {
		int data;
		Node next;
		
		Node (int data) { this.data = data; }
	}
	
	static class LinkedList {
		Node head;
		Node tail;
		
		LinkedList() {}
		
		public void add (Node n) {
			if (head == null) { // if linkedlist is empty
				head = n;
				tail = n;
			}
			else {
				Node tempHead = head;
				
				while (tempHead.next != null) {
					tempHead = tempHead.next;
				}
				tempHead.next = n;
			}
		}
		
		public void printList () {
			Node tempHead = head;
			while (tempHead!=null) {
				System.out.println("Node: " + tempHead.data);
				tempHead = tempHead.next;
			}
		}
		
		public int size() {
			if(head == null) return -1;
			
			Node tempHead = head;
			int counter = 0;
			while (tempHead != null) {
				counter++;
				tempHead = tempHead.next;
			}
			return counter;
		}
		
		public int findKthElement(int k) {
			
			int counter = size() - k; // 4 - 2 = 2
			Node tempHead = head;
			
			while (tempHead != null && counter != 0) {
				counter--;
				tempHead = tempHead.next;
			}
			
			return tempHead.data;
		}
		
		public void removeDuplicates() {
			
		}
	}
	
	public static void main (String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Node(1));
		l1.add(new Node(2));
		l1.add(new Node(3));
		l1.add(new Node(1));
		System.out.println("Size: " + l1.size());
		System.out.println("Kth element: " + l1.findKthElement(2));
		l1.printList();
	}
}
