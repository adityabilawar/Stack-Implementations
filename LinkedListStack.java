import java.util.*;
import java.util.LinkedList;

public class LinkedListStack implements MyStack{
	LinkedList<Object> stack;
	public LinkedListStack() {
		stack = new LinkedList<Object>();
	}
	
	public Object push(Object item) {
		stack.addFirst(item);
		return item;
	}
	public Object pop() {
		Object a = stack.getFirst();
		stack.removeFirst();
		return a;
		
	}
	public Object peek() {
		return stack.getFirst();
	}
	public boolean isEmpty() {
		return stack.size()==0;
	}
	public int size() {
		return stack.size();
	}
	public int search (Object a) {
		int b = 0;
		for(int i = 0; i<stack.size(); i++) {
			b++;
			if(stack.get(i)==a)
				return b;
		}
		System.out.println(a + " does not exist in stack");
		return -1;
	}
	public String toString() {
		String output = "";
		for(int i = 0; i<stack.size(); i++) {
			output+= " " + stack.get(i);
		}
		return output;
	}
}