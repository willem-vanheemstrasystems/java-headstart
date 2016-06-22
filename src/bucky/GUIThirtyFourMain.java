package bucky;

import java.util.*;

public class GUIThirtyFourMain {
	public static void main(String[] args){
		// Variables
		Stack<String> stack = new Stack<String>(); 
		// Add items to the stack
		stack.push("first");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);		
		// Remove items from the stack
		stack.pop();
		printStack(stack);		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);		
	}
	// Method
	private static void printStack(Stack<String> stack){
		if(stack.isEmpty())
			System.out.println("No items in the stack");
		else
			System.out.printf("%s\tTOP\n", stack);
	}
}
