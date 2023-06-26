// Question-2 Implement a queue using a linked list in Java.
//Include the necessary methods such as enqueue, dequeue, and isEmpty.
public class queue {

	public class Queue {
	    private Node front;  
	    private Node rear;   

	    private class Node {
	        int data;
	        Node next;

	        Node(int value) {
	            data = value;
	            next = null;
	        }
	    }

	    public Queue() {
	        front = null;
	        rear = null;
	    }

	    public void enqueue(int value) {
	        Node newNode = new Node(value);
	        if (isEmpty()) {
	            front = newNode;
	            rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	        System.out.println("Enqueued element: " + value);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue element.");
	            return -1;
	        } else {
	            int dequeuedElement = front.data;
	            front = front.next;
	            if (front == null) {
	                rear = null; 
	            }
	            System.out.println("Dequeued element: " + dequeuedElement);
	            return dequeuedElement;
	        }
	    }

	    public boolean isEmpty() {
	        return (front == null);
	    }

	    public void main(String[] args) {
	        Queue queue = new Queue();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.dequeue();
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue(); // Queue is empty, cannot dequeue element
	    }
	}

}
