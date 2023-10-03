/**
 * 
 */
package src.mystack;

/**
 * @author ADD YOUR NAME 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack ==null){
			return null;
		}
		MyNode<T> next =theStack;

		while(next.next!=null){
			if(next.next.next==null){
				T val = next.next.val;
				next.next=null;
				return val;
			}
			next = next.next;
		}


		return null;
	}

	public void push(T v) {
		// TODO To complete
		if(theStack == null){
			theStack = new MyNode<>(v, null);
		}else{
			theStack.next = new MyNode<>(v, null);
		}

	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(5);

		System.out.println(stack.pop());


		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		MyStack<String> stack1 = new MyStack<String>();
		String p1 = "Amer";
		String p2 = "Professor Scharff";
		stack1.push(p1);
		stack1.push(p2);

		System.out.println(stack1.pop());


		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
	}




}
