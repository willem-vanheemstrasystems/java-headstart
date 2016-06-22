package bucky;

import java.util.*;

public class GUIThirtyFiveMain {
	public static void main(String[] args){
		// Variables
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		// Add items to the queue
		priorityQueue.offer("first");
		priorityQueue.offer("second");
		priorityQueue.offer("third");
		System.out.printf("%s\t", priorityQueue);
		System.out.println(); // Blank line
		// Print the item with the highest priority 
		// i.e. the one in front of the queue
		System.out.printf("%s\t", priorityQueue.peek()); // returns 'first'
		System.out.println(); // Blank line
		// Remove the item with the highest priority
		priorityQueue.poll();
		System.out.printf("%s\t", priorityQueue);
	}
}
