import java.util.ArrayList;

public class ArrayListStack implements MyStack {
	ArrayList<Object> stack;
	public ArrayListStack() {
		stack = new ArrayList<Object>();
	}
	public Object push(Object item) {
		stack.add(item);
		return item;
	}
	public Object pop() {
		Object a = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return a;
		
	}
	public Object peek() {
		return stack.get(stack.size()-1);
	}
	public boolean isEmpty() {
		return stack.size()==0;
	}
	public int size() {
		return stack.size();
	}
	public int search (Object a) {
		int b = 0;
		for(int i = stack.size()-1; i>=0; i--) {
			b++;
			if(stack.get(i)==a)
				return b;
		}
		System.out.println(a + " does not exist in stack");
		return -1;
	}
	public String toString() {
		String output = "";
		for(int i = stack.size()-1; i>=0; i--) {
			output+= " " + stack.get(i);
		}
		return output;
	}
	
}