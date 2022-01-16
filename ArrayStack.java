public class ArrayStack implements MyStack{
	Object[] stack;
	
	public ArrayStack() {
		stack = new Object[0];
	}
	
	public Object push(Object item) {
		Object[] NewStack = new Object[stack.length + 1];
		for(int i = 0; i<stack.length; i++) {
			NewStack[i] = stack[i];
		}
		NewStack[stack.length] = item;
		stack = NewStack;
		return item;
	}
	public Object pop() {
		Object a = stack[stack.length - 1];
		Object[] NewStack = new Object[stack.length - 1];
		for(int i = 0; i<stack.length-1; i++) {
			NewStack[i] = stack[i];
		}
		stack = NewStack;
		return a;
		
	}
	public Object peek() {
		return stack[stack.length - 1];
	}
	public boolean isEmpty() {
		return stack.length==0;
	}
	public int size() {
		return stack.length;
	}
	public int search (Object a) {
	int b = 0;
		for(int i = stack.length-1; i>=0; i--) {
			b++;
			if(stack[i]==a)
				return b;
		}
		System.out.println(a + " does not exist in stack");
		return -1;
	}
	public String toString() {
		String output = "";
		for(int i = stack.length-1; i>=0; i--) {
			output+= " " + stack[i];
		}
		return output;
	}
	

}