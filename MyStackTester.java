

public class MyStackTester {
	
	public static void main(String[] args) {
		ArrayListStack tc = new ArrayListStack();
		//ArrayStack tc = new ArrayStack();
	//LinkedListStack tc = new LinkedListStack();
		System.out.println("push()");
		System.out.println(tc.push("quarter"));
		System.out.println(tc.push("dime"));
		System.out.println(tc.push("nickel"));
		System.out.println(tc.push("penny"));
		System.out.println();
		System.out.println("toString() " + tc);
		System.out.println();
		System.out.println("peek() " + tc.peek());
		System.out.println();
		System.out.println("search for dime " + tc.search("dime"));
		System.out.println("search for euro " + tc.search("euro"));
		System.out.println("Size " + tc.size());
		System.out.println();
		System.out.println("pop() and isEmpty()");
		while (!tc.isEmpty())
			System.out.println(tc.pop());
	}
}